package com.peer.dog.controller;

import com.peer.dog.dao.PeerUserMapper;
import com.peer.dog.dao.TbCaptchaMapper;
import com.peer.dog.dao.TbLoginMapper;
import com.peer.dog.dao.entity.*;
import com.peer.dog.pojo.*;
import com.peer.dog.util.BaseUtil;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.Collections;
import java.util.List;

import static com.peer.dog.util.MessageUtil.GET_CAPTCHA_MESSAGE;

/**
 * Created by stephen.zhang on 2018/5/30.
 */
@RestController
@RequestMapping("v1/user")
public class UserControllerV1 {
    @Resource
    TbCaptchaMapper tbCaptchaMapper;

    @Resource
    PeerUserMapper peerUserMapper;

    @Resource
    TbLoginMapper tbLoginMapper;

    @GetMapping("test")
    public Object test(){
        return "true";
    }

    @PostMapping("/captcha/post")
    public BaseResponseVO getCaptcha(@RequestBody GetCaptchaVo getCaptchaVo) {
        //send 验证码
        PeerUserExample peerUserExample = new PeerUserExample();
        peerUserExample.createCriteria().andPhoneEqualTo(getCaptchaVo.getPhone());
        List<PeerUser> peerUsers = peerUserMapper.selectByExample(peerUserExample);
        GetCaptchaResponse response = new GetCaptchaResponse();
        if(!CollectionUtils.isEmpty(peerUsers)) {
            response.setMember(true);
            return BaseResponseVO.SuccessResponse(response);
        }

        TbCaptcha tbCaptcha = new TbCaptcha();
        tbCaptcha.setContent(String.format(GET_CAPTCHA_MESSAGE, "2356"));
        tbCaptcha.setValue("2356");
        tbCaptcha.setSessionId(BaseUtil.uuidGen());
        tbCaptcha.setPhone(getCaptchaVo.getPhone());

        tbCaptchaMapper.insertSelective(tbCaptcha);
        response.setMember(false);
        response.setSessionId(tbCaptcha.getSessionId());

        return BaseResponseVO.SuccessResponse(response);
    }

    @PostMapping("/captcha/check")
    public BaseResponseVO checkCaptcha(@RequestBody CheckCaptchaVo checkCaptchaVo) {
        TbCaptchaExample example = new TbCaptchaExample();
        example.createCriteria().andSessionIdEqualTo(checkCaptchaVo.getSessionId()).andValueEqualTo(checkCaptchaVo.getCaptcha());
        List<TbCaptcha> tbCaptchas = tbCaptchaMapper.selectByExample(example);
        if(tbCaptchas == null || tbCaptchas.size() != 1) {
            return BaseResponseVO.SuccessResponse(false);
        }
        return BaseResponseVO.SuccessResponse(true);
    }

    @PostMapping("/login/check")
    public BaseResponseVO login(@RequestBody LoginRequest loginRequest) {
        PeerUserExample peerUserExample = new PeerUserExample();
        peerUserExample.createCriteria().andPhoneEqualTo(loginRequest.getPhone()).andPasswordEqualTo(loginRequest.getPassword());
        List<PeerUser> peerUsers = peerUserMapper.selectByExample(peerUserExample);
        if(peerUsers != null && peerUsers.size() == 1) {
            TbLogin tbLogin = new TbLogin();
            tbLogin.setUserId(peerUsers.get(0).getId());
            tbLogin.setToken(BaseUtil.uuidGen());
            tbLoginMapper.insertSelective(tbLogin);
            return BaseResponseVO.SuccessResponse(true);
        }

        return BaseResponseVO.SuccessResponse(true);
    }

    @PostMapping("/pass/post")
    public BaseResponseVO setPass(@RequestBody LoginRequest loginRequest) {
        PeerUser peerUser = new PeerUser();
        peerUser.setPhone(loginRequest.getPhone());
        peerUser.setPassword(loginRequest.getPassword());
        peerUserMapper.insert(peerUser);
        return BaseResponseVO.SuccessResponse(true);
    }

    @PostMapping("/info/post")
    public BaseResponseVO setInfos(@RequestBody UserInfoVo userInfoVo) {
        PeerUser peerUser = new PeerUser();
        peerUser.setNick(userInfoVo.getNick());
        peerUser.setIntroduction(userInfoVo.getIntroduction());

        PeerUserExample example = new PeerUserExample();
        example.createCriteria().andPhoneEqualTo(userInfoVo.getPhone());
        peerUserMapper.updateByExampleSelective(peerUser, example);

        return BaseResponseVO.SuccessResponse(true);
    }
}
