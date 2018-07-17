package com.peer.dog.pojo;

import com.peer.dog.dao.entity.TbCaptcha;

import java.io.Serializable;

/**
 *
 * @author stephen.zhang
 * @date 2018/6/10
 */
public class GetCaptchaResponse extends UserBaseResponseVO implements Serializable {
    private static final long serialVersionUID = -6704011972180459294L;
    private boolean isMember;

    private String sessionId;

    private String capthaValue;

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

    public String getCapthaValue() {
        return capthaValue;
    }

    public void setCapthaValue(String capthaValue) {
        this.capthaValue = capthaValue;
    }

    @Override
    public String toString() {
        return "GetCaptchaResponse{" +
                "isMember=" + isMember +
                ", sessionId='" + sessionId + '\'' +
                ", capthaValue='" + capthaValue + '\'' +
                '}';
    }
}
