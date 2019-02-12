package com.peer.dog.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageRowBounds;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.peer.dog.dao.*;
import com.peer.dog.dao.entity.*;
import com.peer.dog.pojo.*;
import com.peer.dog.service.FeedCommentsService;
import com.peer.dog.util.HttpHeaderUtil;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author stephen.zhang
 * @date 2018/6/15.
 */
@RestController
@RequestMapping("/feed")
public class FeedController {
    private static final Logger logger = LoggerFactory.getLogger(FeedController.class);

    @Resource
    FeedBaseMapper feedBaseMapper;

    @Resource
    FeedPickMapper feedPickMapper;

    @Resource
    FeedCommentsService feedCommentsService;

    @Resource
    PeerMapper peerMapper;

    @Resource
    PeerUserMapper peerUserMapper;

    /**
     * 推荐
     *
     * @return
     */
    @GetMapping("/userId")
    public BaseResponseVO getMyFeedByUserId(@RequestParam Integer userId) {
        FeedBaseExample feedBaseExample = new FeedBaseExample();

        feedBaseExample.createCriteria().andOwnerIdEqualTo(userId);
        feedBaseExample.setOrderByClause("create_time DESC");

        PageRowBounds rowBounds = new PageRowBounds(0, 10);
        List<FeedBase> feedBases = feedBaseMapper.selectByExampleWithRowbounds(feedBaseExample, rowBounds);
        if (CollectionUtils.isEmpty(feedBases)) {
            return BaseResponseVO.SuccessResponse(null);
        }

        PeerUser peerUser = peerUserMapper.selectByPrimaryKey(userId);
        Map<Integer, PeerUser> peerUserMap = new HashMap<>(1);
        peerUserMap.put(userId, peerUser);

        List<FeedBaseResponseVO> feedBaseResponseVOS = addComments(feedBases, peerUserMap);

        FeedRecommedResponseVO feedRecommedResponse = addExtInfo(feedBaseResponseVOS);

        return BaseResponseVO.SuccessResponse(feedRecommedResponse);
    }

    private List<FeedBaseResponseVO> addComments(List<FeedBase> feedBases, Map<Integer, PeerUser> peerUserMap) {
        // 留言信息
        List<Integer> commentsVO = Lists.newArrayList();
        feedBases.stream().forEach(feedBase -> commentsVO.add(feedBase.getId()));
        FeedCommentsResponseVO feedCommentsResponseVO = feedCommentsService.batchGetFeedComments(commentsVO);

        // 点赞信息
        Set<Integer> feedIdSet = Sets.newHashSet();

        if(HttpHeaderUtil.getUserId() != null) {
            FeedPickExample example = new FeedPickExample();
            example.createCriteria().andUserIdEqualTo(HttpHeaderUtil.getUserId());
            List<FeedPick> feedPicks = feedPickMapper.selectByExample(example);
            if (!CollectionUtils.isEmpty(feedPicks)) {
                feedPicks.stream().forEach((feedPick) -> feedIdSet.add(feedPick.getFeedId()));
            }
        }

        if (!CollectionUtils.isEmpty(feedBases)) {
            List<FeedBaseResponseVO> feedBaseResponseVOS = new ArrayList<>(feedBases.size());
            feedBases.stream().forEach(
                    (feedBase) -> {
                        FeedBaseResponseVO vo = new FeedBaseResponseVO();
                        vo.setId(feedBase.getId());
                        vo.setLike(feedIdSet.contains(feedBase.getId()));
                        vo.setCommentCount(feedBase.getCommentCount());
                        vo.setImg(feedBase.getImg());
                        vo.setLocation(feedBase.getLocation());
                        vo.setOwnerId(feedBase.getOwnerId());
                        vo.setPeerId(feedBase.getPeerId());
                        vo.setThumbsCount(feedBase.getThumbsCount());
                        vo.setTime(feedBase.getCreateTime());
                        vo.setMessage(feedBase.getMessage());
                        vo.setUserNick(peerUserMap.get(feedBase.getOwnerId()).getNick());
                        vo.setHeadUrl(peerUserMap.get(feedBase.getOwnerId()).getHeadUrl());

                        if (feedCommentsResponseVO != null && feedCommentsResponseVO.getCommentVOS() != null
                                && feedCommentsResponseVO.getCommentVOS().containsKey(feedBase.getId())) {
                            vo.setCommentVO(feedCommentsResponseVO.getCommentVOS().get(feedBase.getId()));

                            List<CommentVO> commentVOList = Lists.newArrayList(vo.getCommentVO().values().iterator());
                            vo.setCommentVOList(commentVOList);
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
    public BaseResponseVO getFeed(
            @RequestParam(required = false, value = "startDateTimeLong") Long startDateTimeLong,
            @RequestParam(required = false, value = "offset", defaultValue = "0") int offset,
            @RequestParam(required = false, defaultValue = "10") int limit) {
        FeedBaseExample feedBaseExample = new FeedBaseExample();

        if(startDateTimeLong == null) {
            startDateTimeLong = System.currentTimeMillis();
        }
        Date startDate = new Date(startDateTimeLong);

        feedBaseExample.createCriteria().andCreateTimeLessThan(startDate);
        feedBaseExample.setOrderByClause("create_time DESC");

        PageRowBounds rowBounds = new PageRowBounds(offset, limit);
        List<FeedBase> feedBases = feedBaseMapper.selectByExampleWithBLOBsWithRowbounds(feedBaseExample, rowBounds);
        logger.info("feedBases {}", JSON.toJSONString(feedBases));
        if (CollectionUtils.isEmpty(feedBases)) {
            return BaseResponseVO.SuccessResponse(null);
        }

        List<Integer> collect = feedBases.stream().map(FeedBase::getOwnerId).collect(Collectors.toList());
        PeerUserExample peerUserExample = new PeerUserExample();
        peerUserExample.createCriteria().andIdIn(collect);
        List<PeerUser> peerUsers = peerUserMapper.selectByExample(peerUserExample);
        Map<Integer, PeerUser> peerUserMap = new HashMap<>(peerUsers.size());
        for (PeerUser peerUser : peerUsers) {
            peerUserMap.put(peerUser.getId(), peerUser);
        }

        List<FeedBaseResponseVO> feedBaseResponseVOS = addComments(feedBases, peerUserMap);

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
            feedBase.setPetName(peer.getName());
            if (nextStartTime == null || nextStartTime.before(feedBase.getTime())) {
                nextStartTime = feedBase.getTime();
            }
        }

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        feedRecommedResponseVO.setStartDateTime(formatter.format(nextStartTime));
        feedRecommedResponseVO.setStartDateTimeLong(nextStartTime.getTime());
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

        // 留言信息
        FeedCommentsResponseVO feedCommentsResponseVO = feedCommentsService.getFeedComments(feedId);

        // 是否还能点赞信息
        FeedPickExample example = new FeedPickExample();
        example.createCriteria().andUserIdEqualTo(HttpHeaderUtil.getUserId());
        List<FeedPick> feedPicks = feedPickMapper.selectByExample(example);
        Set<Integer> feedIdSet = new HashSet<>(feedPicks.size());
        if (!CollectionUtils.isEmpty(feedPicks)) {
            feedPicks.stream().forEach((feedPick) -> feedIdSet.add(feedPick.getFeedId()));
        }

        FeedBaseResponseVO vo = new FeedBaseResponseVO();
        vo.setId(feedBase.getId());
        vo.setLike(feedIdSet.contains(feedBase.getId()));
        vo.setCommentCount(feedBase.getCommentCount());
        vo.setImg(feedBase.getImg());
        vo.setLocation(feedBase.getLocation());
        vo.setOwnerId(feedBase.getOwnerId());
        vo.setPeerId(feedBase.getPeerId());
        vo.setThumbsCount(feedBase.getThumbsCount());

        PeerUser peerUser = peerUserMapper.selectByPrimaryKey(feedBase.getOwnerId());

        vo.setUserNick(peerUser.getNick());
        vo.setHeadUrl(peerUser.getHeadUrl());

        Peer peer = peerMapper.selectByPrimaryKey(feedBase.getPeerId());
        vo.setPetName(peer.getName());

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
        List<FeedBase> feedBases = feedBaseMapper.selectByExampleWithBLOBs(feedBaseExample);

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
