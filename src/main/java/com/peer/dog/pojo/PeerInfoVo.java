package com.peer.dog.pojo;

import java.io.Serializable;

/**
 * @author stephen.zhang
 * @date 2018/6/11.
 */
public class PeerInfoVo implements Serializable {

    private static final long serialVersionUID = 6893830839584678482L;
    /**
     * 宠物昵称
     */
    private String name;

    /**
     * 宠物性别
     */
    private Boolean sex;

    /**
     * 宠物品种
     */
    private String varieties;

    /**
     * 主人手机号
     */
    private String phone;

    /**
     * 宠物头像
     */
    private String peerHeadUrl;

    public PeerInfoVo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getVarieties() {
        return varieties;
    }

    public void setVarieties(String varieties) {
        this.varieties = varieties;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPeerHeadUrl() {
        return peerHeadUrl;
    }

    public void setPeerHeadUrl(String peerHeadUrl) {
        this.peerHeadUrl = peerHeadUrl;
    }

    @Override
    public String toString() {
        return "PeerInfoVo{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", varieties='" + varieties + '\'' +
                ", phone='" + phone + '\'' +
                ", peerHeadUrl='" + peerHeadUrl + '\'' +
                '}';
    }
}
