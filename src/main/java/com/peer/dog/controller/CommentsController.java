package com.peer.dog.controller;

import com.peer.dog.pojo.BaseResponseVO;
import com.peer.dog.pojo.FeedBaseVO;
import com.peer.dog.pojo.FeedCommentsResponseVO;
import com.peer.dog.service.FeedCommentsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author stephen.zhang
 * @date 2018/6/15.
 */
@RestController
@RequestMapping("comment")
public class CommentsController {
    @Resource
    FeedCommentsService feedCommentsService;

    @PostMapping("/get")
    public BaseResponseVO getComments(@RequestBody FeedBaseVO feedBaseVO) {
        FeedCommentsResponseVO feedCommentsResponseVO = feedCommentsService.getFeedComments(feedBaseVO);
        return BaseResponseVO.SuccessResponse(feedCommentsResponseVO);
    }

    /**
     * 点赞
     * @return
     */
    @PostMapping("/post")
    public BaseResponseVO comment() {
        return null;
    }
}
