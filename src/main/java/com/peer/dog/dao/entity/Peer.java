package com.peer.dog.dao.entity;

import java.util.Date;

public class Peer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer.id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer.name
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer.sex
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Short sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer.varieties
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private String varieties;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer.owner_id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Integer ownerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer.peer_head_url
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private String peerHeadUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer.peer_tag
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private String peerTag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer.create_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer.last_update_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer.id
     *
     * @return the value of peer.id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer.id
     *
     * @param id the value for peer.id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer.name
     *
     * @return the value of peer.name
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer.name
     *
     * @param name the value for peer.name
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer.sex
     *
     * @return the value of peer.sex
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Short getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer.sex
     *
     * @param sex the value for peer.sex
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setSex(Short sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer.varieties
     *
     * @return the value of peer.varieties
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public String getVarieties() {
        return varieties;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer.varieties
     *
     * @param varieties the value for peer.varieties
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setVarieties(String varieties) {
        this.varieties = varieties == null ? null : varieties.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer.owner_id
     *
     * @return the value of peer.owner_id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer.owner_id
     *
     * @param ownerId the value for peer.owner_id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer.peer_head_url
     *
     * @return the value of peer.peer_head_url
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public String getPeerHeadUrl() {
        return peerHeadUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer.peer_head_url
     *
     * @param peerHeadUrl the value for peer.peer_head_url
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setPeerHeadUrl(String peerHeadUrl) {
        this.peerHeadUrl = peerHeadUrl == null ? null : peerHeadUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer.peer_tag
     *
     * @return the value of peer.peer_tag
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public String getPeerTag() {
        return peerTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer.peer_tag
     *
     * @param peerTag the value for peer.peer_tag
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setPeerTag(String peerTag) {
        this.peerTag = peerTag == null ? null : peerTag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer.create_time
     *
     * @return the value of peer.create_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer.create_time
     *
     * @param createTime the value for peer.create_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer.last_update_time
     *
     * @return the value of peer.last_update_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer.last_update_time
     *
     * @param lastUpdateTime the value for peer.last_update_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}