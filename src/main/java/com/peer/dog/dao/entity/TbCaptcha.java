package com.peer.dog.dao.entity;

import java.util.Date;

public class TbCaptcha {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.id
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.session_id
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    private String sessionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.phone
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.value
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.content
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.try_count
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    private Integer tryCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.create_time
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.last_update_time
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.user_id
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_captcha.id
     *
     * @return the value of tb_captcha.id
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_captcha.id
     *
     * @param id the value for tb_captcha.id
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_captcha.session_id
     *
     * @return the value of tb_captcha.session_id
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_captcha.session_id
     *
     * @param sessionId the value for tb_captcha.session_id
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_captcha.phone
     *
     * @return the value of tb_captcha.phone
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_captcha.phone
     *
     * @param phone the value for tb_captcha.phone
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_captcha.value
     *
     * @return the value of tb_captcha.value
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_captcha.value
     *
     * @param value the value for tb_captcha.value
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_captcha.content
     *
     * @return the value of tb_captcha.content
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_captcha.content
     *
     * @param content the value for tb_captcha.content
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_captcha.try_count
     *
     * @return the value of tb_captcha.try_count
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public Integer getTryCount() {
        return tryCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_captcha.try_count
     *
     * @param tryCount the value for tb_captcha.try_count
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public void setTryCount(Integer tryCount) {
        this.tryCount = tryCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_captcha.create_time
     *
     * @return the value of tb_captcha.create_time
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_captcha.create_time
     *
     * @param createTime the value for tb_captcha.create_time
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_captcha.last_update_time
     *
     * @return the value of tb_captcha.last_update_time
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_captcha.last_update_time
     *
     * @param lastUpdateTime the value for tb_captcha.last_update_time
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_captcha.user_id
     *
     * @return the value of tb_captcha.user_id
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_captcha.user_id
     *
     * @param userId the value for tb_captcha.user_id
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}