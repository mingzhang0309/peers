package com.peer.dog.controller;

import com.peer.dog.exception.ErrorCode;
import com.peer.dog.exception.PeerException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * @author stephen.zhang
 * @date 2018/7/18.
 */
@RestController
@RequestMapping(("/error"))
public class ErrorController {

    @GetMapping("/")
    public Object handlerFilterError() {
        throw new PeerException(ErrorCode.NO_INFO);
    }

    @PutMapping("/")
    public Object handlerPutFilterError() {
        throw new PeerException(ErrorCode.NO_INFO);
    }


}
