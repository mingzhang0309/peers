package com.peer.dog.pojo;

/**
 * @author stephen.zhang
 * @date 2018/6/15.
 */
public class PostFeedVO extends BaseUserInfoVO {
    private static final long serialVersionUID = -3418396984293549649L;
    /**
     */
    private Integer peerId;

    /**
     */
    private String img;

    /**
     */
    private String message;

    /**
     */
    private String location;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "PostFeedVO{" +
                "peerId=" + peerId +
                ", img='" + img + '\'' +
                ", message='" + message + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
