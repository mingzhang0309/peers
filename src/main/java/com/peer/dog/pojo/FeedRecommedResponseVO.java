package com.peer.dog.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author stephen.zhang
 * @date 2018/8/4.
 */
public class FeedRecommedResponseVO implements Serializable {
    private static final long serialVersionUID = 4040884863140482361L;

    private String startDateTime;

    List<FeedBaseResponseVO> feedBaseResponseVOS;

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public List<FeedBaseResponseVO> getFeedBaseResponseVOS() {
        return feedBaseResponseVOS;
    }

    public void setFeedBaseResponseVOS(List<FeedBaseResponseVO> feedBaseResponseVOS) {
        this.feedBaseResponseVOS = feedBaseResponseVOS;
    }

    @Override
    public String toString() {
        return "FeedRecommedResponseVO{" +
                "startDateTime='" + startDateTime + '\'' +
                ", feedBaseResponseVOS=" + feedBaseResponseVOS +
                '}';
    }
}
