package com.peer.dog.service;

import com.peer.dog.dao.UserPeerRelaMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author stephen.zhang
 * @date 2018/6/15.
 */
@Component
public class UserPeerRelaService {

    @Resource
    UserPeerRelaMapper userPeerRelaMapper;

}
