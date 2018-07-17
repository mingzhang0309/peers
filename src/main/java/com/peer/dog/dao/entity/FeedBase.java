package com.peer.dog.dao.entity;

import java.util.Date;

public class FeedBase {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_base.id
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_base.peer_id
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    private Integer peerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_base.thumbs_count
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    private Integer thumbsCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_base.comment_count
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    private Integer commentCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_base.owner_id
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    private Integer ownerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_base.location
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    private String location;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_base.create_time
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_base.last_update_time
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_base.img
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    private String img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feed_base.message
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    private String message;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_base.id
     *
     * @return the value of feed_base.id
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_base.id
     *
     * @param id the value for feed_base.id
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_base.peer_id
     *
     * @return the value of feed_base.peer_id
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public Integer getPeerId() {
        return peerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_base.peer_id
     *
     * @param peerId the value for feed_base.peer_id
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public void setPeerId(Integer peerId) {
        this.peerId = peerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_base.thumbs_count
     *
     * @return the value of feed_base.thumbs_count
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public Integer getThumbsCount() {
        return thumbsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_base.thumbs_count
     *
     * @param thumbsCount the value for feed_base.thumbs_count
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public void setThumbsCount(Integer thumbsCount) {
        this.thumbsCount = thumbsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_base.comment_count
     *
     * @return the value of feed_base.comment_count
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_base.comment_count
     *
     * @param commentCount the value for feed_base.comment_count
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_base.owner_id
     *
     * @return the value of feed_base.owner_id
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_base.owner_id
     *
     * @param ownerId the value for feed_base.owner_id
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_base.location
     *
     * @return the value of feed_base.location
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_base.location
     *
     * @param location the value for feed_base.location
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_base.create_time
     *
     * @return the value of feed_base.create_time
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_base.create_time
     *
     * @param createTime the value for feed_base.create_time
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_base.last_update_time
     *
     * @return the value of feed_base.last_update_time
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_base.last_update_time
     *
     * @param lastUpdateTime the value for feed_base.last_update_time
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_base.img
     *
     * @return the value of feed_base.img
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_base.img
     *
     * @param img the value for feed_base.img
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feed_base.message
     *
     * @return the value of feed_base.message
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feed_base.message
     *
     * @param message the value for feed_base.message
     *
     * @mbggenerated Wed Jul 18 01:18:37 CST 2018
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}