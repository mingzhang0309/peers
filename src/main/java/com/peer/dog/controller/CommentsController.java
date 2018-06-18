package com.peer.dog.controller;

import com.peer.dog.pojo.BaseResponseVO;
import com.peer.dog.pojo.FeedBaseVO;
import com.peer.dog.pojo.FeedCommentsResponseVO;
import com.peer.dog.service.FeedCommentsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
