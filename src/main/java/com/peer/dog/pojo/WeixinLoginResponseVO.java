package com.peer.dog.pojo;

import java.io.Serializable;

/**
 * @author stephen.zhang
 * @date 2018/7/7.
 */
public class WeixinLoginResponseVO implements Serializable {
    private static final long serialVersionUID = -9110951324192659103L;

    private String openId;

    private String session_key;

    private String unionid;

    private Integer errcode;

    private String errmsg;

    public WeixinLoginResponseVO() {
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Override
    public String toString() {
        return "WeixinLoginResponseVO{" +
                "openId='" + openId + '\'' +
                ", session_key='" + session_key + '\'' +
                ", unionid='" + unionid + '\'' +
                ", errcode=" + errcode +
                ", errmsg='" + errmsg + '\'' +
                '}';
    }
}
