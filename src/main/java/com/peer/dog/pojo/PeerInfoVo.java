package com.peer.dog.pojo;

import java.io.Serializable;

/**
 * @author stephen.zhang
 * @date 2018/6/11.
 */
public class PeerInfoVo implements Serializable {

    private static final long serialVersionUID = 6893830839584678482L;

    /**
     * 宠物id
     */
    private Integer id;

    /**
     * 宠物昵称
     */
    private String name;

    /**
     * 宠物性别
     */
    private Short sex;

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

    /**
     * 主人id
     */
    private Integer ownId;

    /**
     * 宠物说条数
     */
    private Integer feedCount;

    /**
     * 宠物标签
     */
    private String peerTag;

    /**
     * 粉丝数
     */
    private Integer followers;

    public PeerInfoVo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
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

    public Integer getOwnId() {
        return ownId;
    }

    public void setOwnId(Integer ownId) {
        this.ownId = ownId;
    }

    public Integer getFeedCount() {
        return feedCount;
    }

    public void setFeedCount(Integer feedCount) {
        this.feedCount = feedCount;
    }

    public void setPeerTag(String peerTag) {
        this.peerTag = peerTag;
    }

    public String getPeerTag() {
        return peerTag;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollower(Integer followers) {
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "PeerInfoVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", varieties='" + varieties + '\'' +
                ", phone='" + phone + '\'' +
                ", peerHeadUrl='" + peerHeadUrl + '\'' +
                ", ownId=" + ownId +
                ", feedCount=" + feedCount +
                ", peerTag='" + peerTag + '\'' +
                ", followers=" + followers +
                '}';
    }
}
