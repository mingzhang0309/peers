package com.peer.dog.controller;

import com.peer.dog.dao.TbCaptchaMapper;
import com.peer.dog.dao.entity.TbCaptcha;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by stephen.zhang on 2018/5/30.
 */
@RestController
public class UserController {
    @Resource
    TbCaptchaMapper tbCaptchaMapper;

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/test")
    public Object test() {

        TbCaptcha tbCaptcha = tbCaptchaMapper.selectByPrimaryKey(1);

        return tbCaptcha;
    }
}
