package com.peer.dog.dao.entity;

import java.util.Date;

public class PeerUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_user.id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_user.phone
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_user.sex
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Short sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_user.nick
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private String nick;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_user.introduction
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private String introduction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_user.head_url
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private String headUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_user.password
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_user.create_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_user.last_update_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_user.open_id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private String openId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_user.session_key
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private String sessionKey;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_user.id
     *
     * @return the value of peer_user.id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_user.id
     *
     * @param id the value for peer_user.id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_user.phone
     *
     * @return the value of peer_user.phone
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_user.phone
     *
     * @param phone the value for peer_user.phone
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_user.sex
     *
     * @return the value of peer_user.sex
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Short getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_user.sex
     *
     * @param sex the value for peer_user.sex
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setSex(Short sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_user.nick
     *
     * @return the value of peer_user.nick
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public String getNick() {
        return nick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_user.nick
     *
     * @param nick the value for peer_user.nick
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_user.introduction
     *
     * @return the value of peer_user.introduction
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_user.introduction
     *
     * @param introduction the value for peer_user.introduction
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_user.head_url
     *
     * @return the value of peer_user.head_url
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public String getHeadUrl() {
        return headUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_user.head_url
     *
     * @param headUrl the value for peer_user.head_url
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl == null ? null : headUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_user.password
     *
     * @return the value of peer_user.password
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_user.password
     *
     * @param password the value for peer_user.password
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_user.create_time
     *
     * @return the value of peer_user.create_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_user.create_time
     *
     * @param createTime the value for peer_user.create_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_user.last_update_time
     *
     * @return the value of peer_user.last_update_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_user.last_update_time
     *
     * @param lastUpdateTime the value for peer_user.last_update_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_user.open_id
     *
     * @return the value of peer_user.open_id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_user.open_id
     *
     * @param openId the value for peer_user.open_id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_user.session_key
     *
     * @return the value of peer_user.session_key
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public String getSessionKey() {
        return sessionKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_user.session_key
     *
     * @param sessionKey the value for peer_user.session_key
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey == null ? null : sessionKey.trim();
    }
}