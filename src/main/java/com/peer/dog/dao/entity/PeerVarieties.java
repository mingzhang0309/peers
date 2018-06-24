package com.peer.dog.dao.entity;

import java.util.Date;

public class PeerVarieties {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_varieties.id
     *
     * @mbggenerated Sun Jun 24 15:17:22 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_varieties.varieties
     *
     * @mbggenerated Sun Jun 24 15:17:22 CST 2018
     */
    private String varieties;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_varieties.peer_varieties_url
     *
     * @mbggenerated Sun Jun 24 15:17:22 CST 2018
     */
    private String peerVarietiesUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_varieties.create_time
     *
     * @mbggenerated Sun Jun 24 15:17:22 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_varieties.last_update_time
     *
     * @mbggenerated Sun Jun 24 15:17:22 CST 2018
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_varieties.id
     *
     * @return the value of peer_varieties.id
     *
     * @mbggenerated Sun Jun 24 15:17:22 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_varieties.id
     *
     * @param id the value for peer_varieties.id
     *
     * @mbggenerated Sun Jun 24 15:17:22 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_varieties.varieties
     *
     * @return the value of peer_varieties.varieties
     *
     * @mbggenerated Sun Jun 24 15:17:22 CST 2018
     */
    public String getVarieties() {
        return varieties;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_varieties.varieties
     *
     * @param varieties the value for peer_varieties.varieties
     *
     * @mbggenerated Sun Jun 24 15:17:22 CST 2018
     */
    public void setVarieties(String varieties) {
        this.varieties = varieties == null ? null : varieties.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_varieties.peer_varieties_url
     *
     * @return the value of peer_varieties.peer_varieties_url
     *
     * @mbggenerated Sun Jun 24 15:17:22 CST 2018
     */
    public String getPeerVarietiesUrl() {
        return peerVarietiesUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_varieties.peer_varieties_url
     *
     * @param peerVarietiesUrl the value for peer_varieties.peer_varieties_url
     *
     * @mbggenerated Sun Jun 24 15:17:22 CST 2018
     */
    public void setPeerVarietiesUrl(String peerVarietiesUrl) {
        this.peerVarietiesUrl = peerVarietiesUrl == null ? null : peerVarietiesUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_varieties.create_time
     *
     * @return the value of peer_varieties.create_time
     *
     * @mbggenerated Sun Jun 24 15:17:22 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_varieties.create_time
     *
     * @param createTime the value for peer_varieties.create_time
     *
     * @mbggenerated Sun Jun 24 15:17:22 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_varieties.last_update_time
     *
     * @return the value of peer_varieties.last_update_time
     *
     * @mbggenerated Sun Jun 24 15:17:22 CST 2018
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_varieties.last_update_time
     *
     * @param lastUpdateTime the value for peer_varieties.last_update_time
     *
     * @mbggenerated Sun Jun 24 15:17:22 CST 2018
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}