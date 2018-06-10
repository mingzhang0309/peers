package com.peer.dog.pojo;

import java.io.Serializable;

/**
 *
 * @author stephen.zhang
 * @date 2018/6/10
 */
public class GetCaptchaResponse implements Serializable {
    private String sessionId;

    private boolean isMember;

    public GetCaptchaResponse() {
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }

    @Override
    public String toString() {
        return "GetCaptchaResponse{" +
                "sessionId='" + sessionId + '\'' +
                ", isMember=" + isMember +
                '}';
    }
}
