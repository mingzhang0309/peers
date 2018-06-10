package com.peer.dog.pojo;

/**
 *
 * @author stephen.zhang
 * @date 2018/6/10
 */
public class LoginRequest extends BaseRequest {
    private String phone;

    private String password;

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

    @Override
    public String toString() {
        return "LoginRequest{" +
                "phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
