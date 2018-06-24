package com.peer.dog.pojo;

/**
 * @author stephen.zhang
 * @date 2018/6/24.
 */
public class PostCommentVO extends BaseRequest {
    private static final long serialVersionUID = 3580069417994742908L;

    private Integer feedId;

    /**
     * 直接评论feed则可忽略
     * 二级评论则是一级评论的id
     */
    private Integer parentId;

    private String message;

    public Integer getFeedId() {
        return feedId;
    }

    public void setFeedId(Integer feedId) {
        this.feedId = feedId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "PostCommentVO{" +
                "feedId=" + feedId +
                ", parentId=" + parentId +
                ", message='" + message + '\'' +
                '}';
    }
}
