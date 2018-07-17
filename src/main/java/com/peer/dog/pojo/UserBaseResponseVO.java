package com.peer.dog.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author stephen.zhang
 * @date 2018/7/17.
 */
public class UserBaseResponseVO implements Serializable {
    private static final long serialVersionUID = -1824974895364250967L;

    private String token;

    private Date expireTime;

    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public String toString() {
        return "UserBaseResponseVO{" +
                "token='" + token + '\'' +
                ", expireTime=" + expireTime +
                ", userId=" + userId +
                '}';
    }
}
