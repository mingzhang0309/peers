package com.peer.dog.pojo;

import java.io.Serializable;

/**
 * @author stephen.zhang
 * @date 2018/6/11.
 */
public class UserInfoVo implements Serializable {
    private static final long serialVersionUID = 4070773759111794063L;

    private String phone;

    private String imgUrl;

    private String nick;

    private String introduction;

    private String headImgUrl;

    public UserInfoVo() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "imgUrl='" + imgUrl + '\'' +
                ", nick='" + nick + '\'' +
                ", introduction='" + introduction + '\'' +
                ", headImgUrl='" + headImgUrl + '\'' +
                '}';
    }
}
