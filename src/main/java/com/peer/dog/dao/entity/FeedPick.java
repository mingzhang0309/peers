package com.peer.dog.dao.entity;

import java.util.Date;

public class FeedPick {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_pick.id
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_pick.feed_id
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    private Integer feedId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_pick.user_id
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_pick.create_time
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_pick.last_update_time
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_pick.id
     *
     * @return the value of feed_pick.id
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_pick.id
     *
     * @param id the value for feed_pick.id
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_pick.feed_id
     *
     * @return the value of feed_pick.feed_id
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    public Integer getFeedId() {
        return feedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_pick.feed_id
     *
     * @param feedId the value for feed_pick.feed_id
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    public void setFeedId(Integer feedId) {
        this.feedId = feedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_pick.user_id
     *
     * @return the value of feed_pick.user_id
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_pick.user_id
     *
     * @param userId the value for feed_pick.user_id
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_pick.create_time
     *
     * @return the value of feed_pick.create_time
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_pick.create_time
     *
     * @param createTime the value for feed_pick.create_time
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_pick.last_update_time
     *
     * @return the value of feed_pick.last_update_time
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_pick.last_update_time
     *
     * @param lastUpdateTime the value for feed_pick.last_update_time
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}