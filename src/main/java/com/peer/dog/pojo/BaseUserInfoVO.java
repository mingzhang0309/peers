package com.peer.dog.pojo;

/**
 * @author stephen.zhang
 * @date 2018/6/15.
 */
public class BaseUserInfoVO extends BaseRequest {
    private static final long serialVersionUID = -2818158008344229842L;

    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "BaseUserInfoVO{" +
                "userId='" + userId + '\'' +
                '}';
    }
}
