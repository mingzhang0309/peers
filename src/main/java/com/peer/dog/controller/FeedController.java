package com.peer.dog.controller;

import com.peer.dog.dao.FeedBaseMapper;
import com.peer.dog.dao.FeedPickMapper;
import com.peer.dog.dao.UserPeerRelaMapper;
import com.peer.dog.dao.entity.FeedBase;
import com.peer.dog.dao.entity.FeedBaseExample;
import com.peer.dog.dao.entity.FeedPick;
import com.peer.dog.dao.entity.FeedPickExample;
import com.peer.dog.pojo.*;
import com.peer.dog.service.UserPeerRelaService;
import com.peer.dog.util.HttpHeaderUtil;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    /**
     * 推荐
     * @return
     */
    @GetMapping("/stream")
    public BaseResponseVO getFeed() {
        FeedBaseExample feedBaseExample = new FeedBaseExample();
        feedBaseExample.createCriteria().andOwnerIdNotEqualTo(HttpHeaderUtil.getUserId());
        List<FeedBase> feedBases = feedBaseMapper.selectByExample(feedBaseExample);

        FeedPickExample example = new FeedPickExample();
        example.createCriteria().andUserIdEqualTo(HttpHeaderUtil.getUserId());
        List<FeedPick> feedPicks = feedPickMapper.selectByExample(example);
        Set<Integer> feedIdSet = new HashSet<>(feedPicks.size());
        if(!CollectionUtils.isEmpty(feedPicks)) {
            feedPicks.stream().forEach((feedPick) -> feedIdSet.add(feedPick.getFeedId()));
        }

        if(!CollectionUtils.isEmpty(feedBases)) {
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
            });
            return BaseResponseVO.SuccessResponse(feedBaseResponseVOS);
        }

        return BaseResponseVO.SuccessResponse(null);
    }

    /**
     * 关注
     * @return
     */
    @GetMapping("/stream/user")
    public BaseResponseVO getUserFeed() {
        FeedBaseExample feedBaseExample = new FeedBaseExample();
        feedBaseExample.createCriteria().andOwnerIdNotEqualTo(HttpHeaderUtil.getUserId());
        List<FeedBase> feedBases = feedBaseMapper.selectByExample(feedBaseExample);

        return BaseResponseVO.SuccessResponse(feedBases);
    }

    @PostMapping("/stream/add")
    public BaseResponseVO postFeed(@RequestBody PostFeedVO postFeedVO) {
        FeedBase feedBase = new FeedBase();
        feedBase.setPeerId(postFeedVO.getPeerId());
        feedBase.setOwnerId(HttpHeaderUtil.getUserId());
        feedBase.setMessage(postFeedVO.getMessage());
        feedBase.setImg(postFeedVO.getImg());
        feedBase.setLocation(postFeedVO.getLocation());

        feedBaseMapper.insertSelective(feedBase);

        return BaseResponseVO.SuccessResponse("true");
    }

    /**
     * 点赞
     * @return
     */
    @GetMapping("/stream/pick/{feedId}")
    public BaseResponseVO pick(@PathVariable Integer feedId) {
        FeedPickExample feedPickExample = new FeedPickExample();
        feedPickExample.createCriteria().andFeedIdEqualTo(feedId).andUserIdEqualTo(HttpHeaderUtil.getUserId());
        List<FeedPick> feedPicks = feedPickMapper.selectByExample(feedPickExample);
        if(!CollectionUtils.isEmpty(feedPicks)) {
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
