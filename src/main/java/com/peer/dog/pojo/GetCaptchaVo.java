package com.peer.dog.pojo;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.io.Serializable;

/**
 *
 * @author stephen.zhang
 * @date 2018/6/10
 */
public class GetCaptchaVo implements Serializable {
    String phone;

    public GetCaptchaVo() {
    }

    public GetCaptchaVo(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "GetCaptchaVo{" +
                "phone='" + phone + '\'' +
                '}';
    }
}
