package com.peer.dog.controller;

import com.peer.dog.dao.FeedBaseMapper;
import com.peer.dog.dao.UserPeerRelaMapper;
import com.peer.dog.dao.entity.FeedBase;
import com.peer.dog.dao.entity.FeedBaseExample;
import com.peer.dog.pojo.BaseResponseVO;
import com.peer.dog.pojo.BaseUserInfoVO;
import com.peer.dog.pojo.PostFeedVO;
import com.peer.dog.pojo.UserInfoVo;
import com.peer.dog.service.UserPeerRelaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author stephen.zhang
 * @date 2018/6/15.
 */
@RestController
@RequestMapping("v1/feed")
public class FeedController {
    @Resource
    FeedBaseMapper feedBaseMapper;

    @Resource
    UserPeerRelaService userPeerRelaService;

    @PostMapping("/stream/post")
    public BaseResponseVO getFeed(@RequestBody BaseUserInfoVO baseUserInfoVO) {
        FeedBaseExample feedBaseExample = new FeedBaseExample();
        feedBaseExample.createCriteria().andOwnerIdNotEqualTo(baseUserInfoVO.getUserId());
        List<FeedBase> feedBases = feedBaseMapper.selectByExample(feedBaseExample);

        return BaseResponseVO.SuccessResponse(feedBases);
    }

    @PostMapping("/stream/add")
    public BaseResponseVO postFeed(@RequestBody PostFeedVO postFeedVO) {
        FeedBase feedBase = new FeedBase();
        feedBase.setPeerId(postFeedVO.getPeerId());
        feedBase.setOwnerId(postFeedVO.getUserId());
        feedBase.setMessage(postFeedVO.getMessage());
        feedBase.setImg(postFeedVO.getImg());
        feedBase.setLocation(postFeedVO.getLocation());
        feedBaseMapper.insertSelective(feedBase);

        return BaseResponseVO.SuccessResponse("true");
    }
}
