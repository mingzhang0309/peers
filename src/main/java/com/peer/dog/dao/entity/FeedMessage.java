package com.peer.dog.dao.entity;

import java.util.Date;

public class FeedMessage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_message.id
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_message.feed_id
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    private Integer feedId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_message.user_id
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_message.message
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    private String message;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_message.parent_id
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_message.create_time
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_message.last_update_time
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_message.id
     *
     * @return the value of feed_message.id
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_message.id
     *
     * @param id the value for feed_message.id
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_message.feed_id
     *
     * @return the value of feed_message.feed_id
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    public Integer getFeedId() {
        return feedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_message.feed_id
     *
     * @param feedId the value for feed_message.feed_id
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    public void setFeedId(Integer feedId) {
        this.feedId = feedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_message.user_id
     *
     * @return the value of feed_message.user_id
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_message.user_id
     *
     * @param userId the value for feed_message.user_id
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_message.message
     *
     * @return the value of feed_message.message
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_message.message
     *
     * @param message the value for feed_message.message
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_message.parent_id
     *
     * @return the value of feed_message.parent_id
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_message.parent_id
     *
     * @param parentId the value for feed_message.parent_id
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_message.create_time
     *
     * @return the value of feed_message.create_time
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_message.create_time
     *
     * @param createTime the value for feed_message.create_time
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_message.last_update_time
     *
     * @return the value of feed_message.last_update_time
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_message.last_update_time
     *
     * @param lastUpdateTime the value for feed_message.last_update_time
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}