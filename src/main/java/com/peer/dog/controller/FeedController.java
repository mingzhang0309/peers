package com.peer.dog.controller;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.peer.dog.dao.FeedBaseMapper;
import com.peer.dog.dao.FeedPickMapper;
import com.peer.dog.dao.PeerMapper;
import com.peer.dog.dao.UserPeerRelaMapper;
import com.peer.dog.dao.entity.*;
import com.peer.dog.pojo.*;
import com.peer.dog.service.FeedCommentsService;
import com.peer.dog.service.UserPeerRelaService;
import com.peer.dog.util.HttpHeaderUtil;
import org.apache.ibatis.session.RowBounds;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Nullable;
import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author stephen.zhang
 * @date 2018/6/15.
 */
@RestController
@RequestMapping("/feed")
public class FeedController {
    @Resource
    FeedBaseMapper feedBaseMapper;

    @Resource
    FeedPickMapper feedPickMapper;

    @Resource
    FeedCommentsService feedCommentsService;

    @Resource
    PeerMapper peerMapper;

    /**
     * 推荐
     *
     * @return
     */
    @GetMapping("/userId")
    public BaseResponseVO getMyFeedByUserId(@RequestParam Integer userId) {
        FeedBaseExample feedBaseExample = new FeedBaseExample();

        feedBaseExample.createCriteria().andOwnerIdEqualTo(userId);

        RowBounds rowBounds = new RowBounds(0, 10);
        List<FeedBase> feedBases = feedBaseMapper.selectByExampleWithRowbounds(feedBaseExample, rowBounds);
        if(CollectionUtils.isEmpty(feedBases)) {
            return BaseResponseVO.SuccessResponse(null);
        }

        List<FeedBaseResponseVO> feedBaseResponseVOS = addComments(feedBases);

        return BaseResponseVO.SuccessResponse(feedBaseResponseVOS);
    }

    private List<FeedBaseResponseVO> addComments(List<FeedBase> feedBases) {
        //留言信息
        List<Integer> commentsVO = Lists.newArrayList();
        feedBases.stream().forEach(feedBase -> commentsVO.add(feedBase.getId()));
        FeedCommentsResponseVO feedCommentsResponseVO = feedCommentsService.batchGetFeedComments(commentsVO);

        //点赞信息
        FeedPickExample example = new FeedPickExample();
        example.createCriteria().andUserIdEqualTo(HttpHeaderUtil.getUserId());
        List<FeedPick> feedPicks = feedPickMapper.selectByExample(example);
        Set<Integer> feedIdSet = new HashSet<>(feedPicks.size());
        if (!CollectionUtils.isEmpty(feedPicks)) {
            feedPicks.stream().forEach((feedPick) -> feedIdSet.add(feedPick.getFeedId()));
        }

        if (!CollectionUtils.isEmpty(feedBases)) {
            List<FeedBaseResponseVO> feedBaseResponseVOS = new ArrayList<>(feedBases.size());
            feedBases.stream().forEach((feedBase) -> {
                FeedBaseResponseVO vo = new FeedBaseResponseVO();
                vo.setId(feedBase.getId());
                vo.setCanThumbs(feedIdSet.contains(feedBase.getId()));
                vo.setCommentCount(feedBase.getCommentCount());
                vo.setImg(feedBase.getImg());
                vo.setLocation(feedBase.getLocation());
                vo.setOwnerId(feedBase.getOwnerId());
                vo.setPeerId(feedBase.getPeerId());
                vo.setThumbsCount(feedBase.getThumbsCount());
                vo.setTime(feedBase.getCreateTime());

                if (feedCommentsResponseVO != null && feedCommentsResponseVO.getCommentVOS() != null) {
                    vo.setCommentVO(feedCommentsResponseVO.getCommentVOS().get(feedBase.getId()));
                }
                feedBaseResponseVOS.add(vo);
            });
            return feedBaseResponseVOS;
        } else {
            return new ArrayList<>();
        }
    }

    /**
     * 推荐
     * 
     * @return
     */
    @GetMapping()
    public BaseResponseVO getFeed(@RequestParam String startDateTime) {
        FeedBaseExample feedBaseExample = new FeedBaseExample();
        if(StringUtils.isEmpty(startDateTime)) {
            startDateTime = "1970-01-01 00:00:00";
        }
        LocalDateTime startTime;
        try {

            startTime = LocalDateTime
                    .parse(startDateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        } catch (Exception e) {
            startTime = LocalDateTime
                    .parse("2018-01-01 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        }

        feedBaseExample.createCriteria()
                .andCreateTimeGreaterThan(Date.from(startTime.atZone(ZoneId.systemDefault()).toInstant()));

        RowBounds rowBounds = new RowBounds(0, 10);
        List<FeedBase> feedBases = feedBaseMapper.selectByExampleWithRowbounds(feedBaseExample, rowBounds);
        if(CollectionUtils.isEmpty(feedBases)) {
            return BaseResponseVO.SuccessResponse(null);
        }

        List<FeedBaseResponseVO> feedBaseResponseVOS = addComments(feedBases);

        FeedRecommedResponseVO feedRecommedResponse = addExtInfo(feedBaseResponseVOS);

        return BaseResponseVO.SuccessResponse(feedRecommedResponse);
    }

    private FeedRecommedResponseVO addExtInfo(List<FeedBaseResponseVO> feedBases) {
        FeedRecommedResponseVO feedRecommedResponseVO = new FeedRecommedResponseVO();


        Date nextStartTime = null;
        for (FeedBaseResponseVO feedBase : feedBases) {
            Peer peer = peerMapper.selectByPrimaryKey(feedBase.getPeerId());
            feedBase.setSex(peer.getSex());
            feedBase.setVarieties(peer.getVarieties());
            if(nextStartTime == null || nextStartTime.before(feedBase.getTime())) {
                nextStartTime = feedBase.getTime();
            }
        }

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        feedRecommedResponseVO.setStartDateTime(formatter.format(nextStartTime));
        feedRecommedResponseVO.setFeedBaseResponseVOS(feedBases);

        return feedRecommedResponseVO;
    }

    /**
     * feed详情页
     *
     * @return
     */
    @GetMapping("/{feedId}")
    public BaseResponseVO getFeedDetail(@PathVariable Integer feedId) {
        FeedBase feedBase = feedBaseMapper.selectByPrimaryKey(feedId);

        //留言信息
        FeedCommentsResponseVO feedCommentsResponseVO = feedCommentsService.getFeedComments(feedId);

        //是否还能点赞信息
        FeedPickExample example = new FeedPickExample();
        example.createCriteria().andUserIdEqualTo(HttpHeaderUtil.getUserId());
        List<FeedPick> feedPicks = feedPickMapper.selectByExample(example);
        Set<Integer> feedIdSet = new HashSet<>(feedPicks.size());
        if (!CollectionUtils.isEmpty(feedPicks)) {
            feedPicks.stream().forEach((feedPick) -> feedIdSet.add(feedPick.getFeedId()));
        }

        FeedBaseResponseVO vo = new FeedBaseResponseVO();
        vo.setId(feedBase.getId());
        vo.setCanThumbs(feedIdSet.contains(feedBase.getId()));
        vo.setCommentCount(feedBase.getCommentCount());
        vo.setImg(feedBase.getImg());
        vo.setLocation(feedBase.getLocation());
        vo.setOwnerId(feedBase.getOwnerId());
        vo.setPeerId(feedBase.getPeerId());
        vo.setThumbsCount(feedBase.getThumbsCount());

        if (feedCommentsResponseVO != null && feedCommentsResponseVO.getCommentVOS() != null) {
            vo.setCommentVO(feedCommentsResponseVO.getCommentVOS().get(feedId));
        }

        return BaseResponseVO.SuccessResponse(vo);
    }

    /**
     * 关注
     * 
     * @return
     */
    @GetMapping("/follow")
    public BaseResponseVO getUserFeed() {
        FeedBaseExample feedBaseExample = new FeedBaseExample();
        feedBaseExample.createCriteria().andOwnerIdNotEqualTo(HttpHeaderUtil.getUserId());
        List<FeedBase> feedBases = feedBaseMapper.selectByExample(feedBaseExample);

        return BaseResponseVO.SuccessResponse(feedBases);
    }

    @PostMapping()
    public BaseResponseVO postFeed(@RequestBody PostFeedVO postFeedVO) {
        FeedBase feedBase = new FeedBase();
        feedBase.setPeerId(postFeedVO.getPeerId());
        feedBase.setOwnerId(HttpHeaderUtil.getUserId());
        feedBase.setMessage(postFeedVO.getMessage());
        feedBase.setImg(postFeedVO.getImg());
        feedBase.setLocation(postFeedVO.getLocation());

        feedBaseMapper.insertSelective(feedBase);

        BaseResponseVO baseResponseVO = BaseResponseVO.SuccessResponse(true);
        baseResponseVO.setNextHref("/pick/" + feedBase.getId());
        return baseResponseVO;
    }

    /**
     * 点赞
     * 
     * @return
     */
    @PostMapping("/pick/{feedId}")
    public BaseResponseVO pick(@PathVariable Integer feedId) {
        FeedPickExample feedPickExample = new FeedPickExample();
        feedPickExample.createCriteria().andFeedIdEqualTo(feedId).andUserIdEqualTo(HttpHeaderUtil.getUserId());
        List<FeedPick> feedPicks = feedPickMapper.selectByExample(feedPickExample);
        if (!CollectionUtils.isEmpty(feedPicks)) {
            throw new RuntimeException("不允许重复点赞");
        }

        FeedPick feedPick = new FeedPick();
        feedPick.setFeedId(feedId);
        feedPick.setUserId(HttpHeaderUtil.getUserId());
        feedPickMapper.insertSelective(feedPick);

        FeedBase feedBase = feedBaseMapper.selectByPrimaryKey(feedId);
        feedBase.setThumbsCount(feedBase.getThumbsCount() + 1);
        feedBaseMapper.updateByPrimaryKeySelective(feedBase);
        return BaseResponseVO.SuccessResponse("true");
    }
}
