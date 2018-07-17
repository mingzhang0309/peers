package com.peer.dog.pojo;

import com.peer.dog.util.HttpHeaderUtil;

import java.io.Serializable;

/**
 * @author stephen.zhang
 * @date 2018/6/10.
 */
public abstract class BaseRequest implements Serializable {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
