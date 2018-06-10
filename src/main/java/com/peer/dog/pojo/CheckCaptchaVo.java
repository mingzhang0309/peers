package com.peer.dog.pojo;

import java.io.Serializable;

/**
 *
 * @author stephen.zhang
 * @date 2018/6/10
 */
public class CheckCaptchaVo implements Serializable {
    private String sessionId;

    private String captcha;

    public CheckCaptchaVo() {
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    @Override
    public String toString() {
        return "CheckCaptchaVo{" +
                "sessionId='" + sessionId + '\'' +
                ", captcha='" + captcha + '\'' +
                '}';
    }
}
