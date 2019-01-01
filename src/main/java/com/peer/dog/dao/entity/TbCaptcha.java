package com.peer.dog.dao.entity;

import java.util.Date;

public class TbCaptcha {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.id
     *
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.session_id
     *
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
     */
    private String sessionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.phone
     *
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.value
     *
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.content
     *
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.try_count
     *
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
     */
    private Integer tryCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.create_time
     *
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_captcha.last_update_time
     *
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_captcha.id
     *
     * @return the value of tb_captcha.id
     *
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
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
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
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
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
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
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
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
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
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
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
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
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
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
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
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
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
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
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
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
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
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
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
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
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
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
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
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
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
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
     * @mbggenerated Tue Jan 01 15:59:10 CST 2019
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}