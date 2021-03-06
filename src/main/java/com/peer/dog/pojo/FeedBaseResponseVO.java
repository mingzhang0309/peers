package com.peer.dog.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * @author stephen.zhang
 * @date 2018/6/19.
 */
public class FeedBaseResponseVO implements Serializable {
    private static final long serialVersionUID = -3042185034017647648L;

    private Integer id;

    private Integer peerId;

    private String img;

    private String message;

    private Integer thumbsCount;

    private Integer commentCount;

    private Integer ownerId;

    private String location;

    private boolean like;

    private Short sex;

    private String varieties;

    private Date time;

    private String userNick;

    private String headUrl;

    private String petName;

    @JsonIgnore
    private Map<Integer, CommentVO> commentVO;

    private List<CommentVO> commentVOList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPeerId() {
        return peerId;
    }

    public void setPeerId(Integer peerId) {
        this.peerId = peerId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getThumbsCount() {
        return thumbsCount;
    }

    public void setThumbsCount(Integer thumbsCount) {
        this.thumbsCount = thumbsCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public Map<Integer, CommentVO> getCommentVO() {
        return commentVO;
    }

    public void setCommentVO(Map<Integer, CommentVO> commentVO) {
        this.commentVO = commentVO;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public List<CommentVO> getCommentVOList() {
        return commentVOList;
    }

    public void setCommentVOList(List<CommentVO> commentVOList) {
        this.commentVOList = commentVOList;
    }

    @Override
    public String toString() {
        return "FeedBaseResponseVO{" +
                "id=" + id +
                ", peerId=" + peerId +
                ", img='" + img + '\'' +
                ", message='" + message + '\'' +
                ", thumbsCount=" + thumbsCount +
                ", commentCount=" + commentCount +
                ", ownerId=" + ownerId +
                ", location='" + location + '\'' +
                ", like=" + like +
                ", sex=" + sex +
                ", varieties='" + varieties + '\'' +
                ", time=" + time +
                ", userNick='" + userNick + '\'' +
                ", headUrl='" + headUrl + '\'' +
                ", petName='" + petName + '\'' +
                ", commentVO=" + commentVO +
                ", commentVOList=" + commentVOList +
                '}';
    }
}
