package com.peer.dog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by stephen.zhang on 2018/5/30.
 */
@RestController
public class UserController {
    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }
}
