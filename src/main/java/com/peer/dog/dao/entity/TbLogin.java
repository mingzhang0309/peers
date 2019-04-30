package com.peer.dog.dao.entity;

import java.util.Date;

public class TbLogin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_login.id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_login.user_id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_login.token
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private String token;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_login.device_type
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Byte deviceType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_login.device_sign
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private String deviceSign;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_login.login_type
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Boolean loginType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_login.ip
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_login.create_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_login.expire_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Date expireTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_login.last_update_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_login.id
     *
     * @return the value of tb_login.id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_login.id
     *
     * @param id the value for tb_login.id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_login.user_id
     *
     * @return the value of tb_login.user_id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_login.user_id
     *
     * @param userId the value for tb_login.user_id
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_login.token
     *
     * @return the value of tb_login.token
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_login.token
     *
     * @param token the value for tb_login.token
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_login.device_type
     *
     * @return the value of tb_login.device_type
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Byte getDeviceType() {
        return deviceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_login.device_type
     *
     * @param deviceType the value for tb_login.device_type
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setDeviceType(Byte deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_login.device_sign
     *
     * @return the value of tb_login.device_sign
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public String getDeviceSign() {
        return deviceSign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_login.device_sign
     *
     * @param deviceSign the value for tb_login.device_sign
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setDeviceSign(String deviceSign) {
        this.deviceSign = deviceSign == null ? null : deviceSign.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_login.login_type
     *
     * @return the value of tb_login.login_type
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Boolean getLoginType() {
        return loginType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_login.login_type
     *
     * @param loginType the value for tb_login.login_type
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setLoginType(Boolean loginType) {
        this.loginType = loginType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_login.ip
     *
     * @return the value of tb_login.ip
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_login.ip
     *
     * @param ip the value for tb_login.ip
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_login.create_time
     *
     * @return the value of tb_login.create_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_login.create_time
     *
     * @param createTime the value for tb_login.create_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_login.expire_time
     *
     * @return the value of tb_login.expire_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_login.expire_time
     *
     * @param expireTime the value for tb_login.expire_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_login.last_update_time
     *
     * @return the value of tb_login.last_update_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_login.last_update_time
     *
     * @param lastUpdateTime the value for tb_login.last_update_time
     *
     * @mbggenerated Tue Apr 30 21:29:10 CST 2019
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}