package com.peer.dog.pojo;

/**
 * @author stephen.zhang
 * @date 2018/6/15.
 */
public class FeedBaseVO extends BaseRequest {
    private static final long serialVersionUID = -7316718967499469948L;
    private Integer feedId;

    public Integer getFeedId() {
        return feedId;
    }

    public void setFeedId(Integer feedId) {
        this.feedId = feedId;
    }

    @Override
    public String toString() {
        return "FeedBaseVO{" +
                "feedId=" + feedId +
                '}';
    }
}
