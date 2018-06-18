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
import com.peer.dog.util.HttpHeaderUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author stephen.zhang
 * @date 2018/6/15.
 */
@RestController
@RequestMapping("/feed")
public class FeedController {
    @Resource
    FeedBaseMapper feedBaseMapper;

    @GetMapping("/stream")
    public BaseResponseVO getFeed() {
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
}
