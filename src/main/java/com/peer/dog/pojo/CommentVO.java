package com.peer.dog.pojo;

import java.util.List;

import java.io.Serializable;

/**
 * @author stephen.zhang
 * @date 2018/6/15.
 */
public class CommentVO implements Serializable {
    private static final long serialVersionUID = 5839582432757940129L;

    private Integer id;

    private String message;

    private String userNick;

    private String headUrl;

    private List<CommentVO> subComment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<CommentVO> getSubComment() {
        return subComment;
    }

    public void setSubComment(List<CommentVO> subComment) {
        this.subComment = subComment;
    }

    @Override
    public String toString() {
        return "CommentVO{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", userNick='" + userNick + '\'' +
                ", headUrl='" + headUrl + '\'' +
                ", subComment=" + subComment +
                '}';
    }
}
