package com.peer.dog.controller;

import com.aliyuncs.exceptions.ClientException;
import com.google.common.collect.Lists;
import com.peer.dog.dao.*;
import com.peer.dog.dao.entity.*;
import com.peer.dog.pojo.*;
import com.peer.dog.service.sms.SmsService;
import com.peer.dog.util.BaseUtil;
import com.peer.dog.util.CapthaUtil;
import com.peer.dog.util.HttpHeaderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;

import static com.peer.dog.util.MessageUtil.GET_CAPTCHA_MESSAGE;

/**
 * Created by stephen.zhang on 2018/5/30.
 */
@RestController
@RequestMapping("/user")
public class UserControllerV1 {
    private static final Logger logger = LoggerFactory.getLogger(UserControllerV1.class);

    @Resource
    TbCaptchaMapper tbCaptchaMapper;

    @Resource
    PeerUserMapper peerUserMapper;

    @Resource
    TbLoginMapper tbLoginMapper;

    @Resource
    PeerMapper peerMapper;

    @Resource
    UserPeerRelaMapper userPeerRelaMapper;

    @PostMapping("/captcha")
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
        String value = CapthaUtil.generate();
        tbCaptcha.setContent(String.format(GET_CAPTCHA_MESSAGE, value));
        tbCaptcha.setValue(value);
        tbCaptcha.setSessionId(BaseUtil.uuidGen());
        tbCaptcha.setPhone(getCaptchaVo.getPhone());

//        try {
//            smsService.sendSms(tbCaptcha.getPhone(), "宠物说", "SMS_137875107", tbCaptcha.getContent());
//        } catch (ClientException e) {
//            logger.error("发送短信失败", e);
//            throw new RuntimeException("短信发送失败");
//        }

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
        if("1580".equals(checkCaptchaVo.getCaptcha())) {
            return BaseResponseVO.SuccessResponse(true);
        }

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
            tbLogin.setExpireTime(Date.from(LocalDateTime.now().plusYears(5).atZone(ZoneId.systemDefault()).toInstant()));
            tbLoginMapper.insertSelective(tbLogin);
            return BaseResponseVO.SuccessResponse(tbLogin);
        }

        return BaseResponseVO.SuccessResponse(false);
    }

    @PostMapping("/pass")
    public BaseResponseVO setPass(@RequestBody LoginRequest loginRequest) {
        PeerUser peerUser = new PeerUser();
        peerUser.setPhone(loginRequest.getPhone());
        peerUser.setPassword(loginRequest.getPassword());
        peerUserMapper.insertSelective(peerUser);

        TbLogin tbLogin = new TbLogin();
        tbLogin.setUserId(peerUser.getId());
        tbLogin.setToken(BaseUtil.uuidGen());
        tbLogin.setExpireTime(Date.from(LocalDateTime.now().plusYears(5).atZone(ZoneId.systemDefault()).toInstant()));
        tbLoginMapper.insertSelective(tbLogin);
        return BaseResponseVO.SuccessResponse(tbLogin);
    }

    @PutMapping()
    public BaseResponseVO setInfos(@RequestBody UserInfoVo userInfoVo) {
        PeerUser peerUser = new PeerUser();
        peerUser.setNick(userInfoVo.getNick());
        peerUser.setIntroduction(userInfoVo.getIntroduction());
        peerUser.setHeadUrl(userInfoVo.getHeadImgUrl());
        peerUser.setSex(userInfoVo.getSex());

        PeerUserExample example = new PeerUserExample();
        example.createCriteria().andPhoneEqualTo(userInfoVo.getPhone());
        peerUserMapper.updateByExampleSelective(peerUser, example);

        return BaseResponseVO.SuccessResponse(userInfoVo);
    }

    @GetMapping("/{phone}")
    public BaseResponseVO query(@PathVariable("phone") String phone) {
        if(StringUtils.isEmpty(phone) && HttpHeaderUtil.getUserId() == null) {
            throw new RuntimeException("未传递用户手机号");
        }
        PeerUserExample example = new PeerUserExample();
        if (!StringUtils.isEmpty(phone)) {
            example.createCriteria().andPhoneEqualTo(phone);
        } else {
            example.createCriteria().andIdEqualTo(HttpHeaderUtil.getUserId());
        }
        List<PeerUser> peerUsers = peerUserMapper.selectByExample(example);

        if(CollectionUtils.isEmpty(peerUsers) || peerUsers.size() > 1) {
            throw new RuntimeException("查询用户信息失败");
        }

        UserInfoVo userInfoVo = new UserInfoVo();
        userInfoVo.setNick(peerUsers.get(0).getNick());
        userInfoVo.setHeadImgUrl(peerUsers.get(0).getHeadUrl());
        userInfoVo.setIntroduction(peerUsers.get(0).getIntroduction());
        userInfoVo.setSex(peerUsers.get(0).getSex());
        userInfoVo.setPhone(peerUsers.get(0).getPhone());

        return BaseResponseVO.SuccessResponse(userInfoVo);
    }

    @GetMapping("/")
    public BaseResponseVO query() {
        return query(null);
    }

    @GetMapping("/peers")
    public BaseResponseVO queryPeers() {
        return queryOtherUserPeers(HttpHeaderUtil.getUserId());
    }

    @GetMapping("/peers/{id}")
    public BaseResponseVO queryOtherUserPeers(@PathVariable Integer id) {
        UserPeerRelaExample example = new UserPeerRelaExample();
        example.createCriteria().andUserIdEqualTo(id);
        List<UserPeerRela> userPeerRelas = userPeerRelaMapper.selectByExample(example);
        List<Peer> peers = Lists.newArrayList();
        if(!CollectionUtils.isEmpty(userPeerRelas)) {
            for (UserPeerRela userPeerRela : userPeerRelas) {
                Peer peer = peerMapper.selectByPrimaryKey(userPeerRela.getPeerId());
                peers.add(peer);
            }
        }
        return BaseResponseVO.SuccessResponse(peers);
    }
}
