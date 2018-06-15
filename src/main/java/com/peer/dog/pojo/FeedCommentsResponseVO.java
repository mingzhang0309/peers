package com.peer.dog.pojo;

import java.util.List;

import java.io.Serializable;

/**
 * @author stephen.zhang
 * @date 2018/6/15.
 */
public class FeedCommentsResponseVO implements Serializable {
    private static final long serialVersionUID = 9222833381490902561L;

    private List<CommentVO> commentVOS;

    public List<CommentVO> getCommentVOS() {
        return commentVOS;
    }

    public void setCommentVOS(List<CommentVO> commentVOS) {
        this.commentVOS = commentVOS;
    }

    @Override
    public String toString() {
        return "FeedCommentsResponseVO{" +
                "commentVOS=" + commentVOS +
                '}';
    }
}
