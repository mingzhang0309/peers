package com.peer.dog.controller;

import com.peer.dog.pojo.BaseResponseVO;
import com.peer.dog.pojo.FeedBaseVO;
import com.peer.dog.pojo.FeedCommentsResponseVO;
import com.peer.dog.pojo.PostCommentVO;
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

    /**
     * 留言
     * @return
     */
    @PostMapping("/")
    public BaseResponseVO comment(@RequestBody PostCommentVO postCommentVO) {
        feedCommentsService.putComment(postCommentVO);
        return BaseResponseVO.SuccessResponse(true);
    }
}
