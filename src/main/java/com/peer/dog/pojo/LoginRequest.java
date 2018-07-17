package com.peer.dog.pojo;

import java.io.Serializable;

/**
 *
 * @author stephen.zhang
 * @date 2018/6/10
 */
public class LoginRequest implements Serializable {
    private static final long serialVersionUID = -69123675265473804L;
    private String phone;

    private String password;

    private String sessionId;

    public LoginRequest() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                "phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", sessionId='" + sessionId + '\'' +
                '}';
    }
}
