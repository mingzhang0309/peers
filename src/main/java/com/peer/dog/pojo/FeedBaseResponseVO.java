package com.peer.dog.pojo;

import java.io.Serializable;

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

    private boolean isCanThumbs;

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

    public boolean isCanThumbs() {
        return isCanThumbs;
    }

    public void setCanThumbs(boolean canThumbs) {
        isCanThumbs = canThumbs;
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
                ", isCanThumbs=" + isCanThumbs +
                '}';
    }
}
