package com.peer.dog.controller;

import com.alibaba.fastjson.JSON;
import com.peer.dog.dao.PeerUserMapper;
import com.peer.dog.dao.TbLoginMapper;
import com.peer.dog.dao.entity.PeerUser;
import com.peer.dog.dao.entity.PeerUserExample;
import com.peer.dog.dao.entity.TbLogin;
import com.peer.dog.pojo.BaseResponseVO;
import com.peer.dog.pojo.WeixinLoginResponseVO;
import com.peer.dog.service.SystemContextService;
import com.peer.dog.util.BaseUtil;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

/**
 * @author stephen.zhang
 * @date 2018/7/7.
 */
@RestController
@RequestMapping("/weixin")
public class WeixinController {
    private static final Logger logger = LoggerFactory.getLogger(WeixinController.class);

    private static final String WEIXIN_LOGIN_URL = "https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code";

    @Resource
    SystemContextService systemContextService;

    @Resource
    TbLoginMapper tbLoginMapper;

    @Resource
    PeerUserMapper peerUserMapper;

    @GetMapping("/jscode2session")
    public Object jscode2session(@RequestParam("code") String code) {
        String url = String.format(WEIXIN_LOGIN_URL, systemContextService.getAppId(), systemContextService.getAppSecret(), code);
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(url);
        try {
            HttpResponse response = client.execute(request);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                /**读取服务器返回过来的json字符串数据**/
                String strResult = EntityUtils.toString(response.getEntity());

                WeixinLoginResponseVO responseVO = JSON.parseObject(strResult, WeixinLoginResponseVO.class);
                logger.info("微信返回结果 {}", responseVO);
                if(responseVO != null && responseVO.getErrcode() == null) {
                    //微信登陆成功，获取用户信息
                    String openId = responseVO.getOpenId();
                    String sessionKey = responseVO.getSession_key();
                    PeerUserExample ux = new PeerUserExample();
                    ux.createCriteria().andOpenIdEqualTo(openId);
                    List<PeerUser> peerUsers = peerUserMapper.selectByExample(ux);

                    Integer userId;
                    if(CollectionUtils.isEmpty(peerUsers)) {
                        //初始化用户
                        PeerUser peerUser = new PeerUser();
                        //假的先替换
                        peerUser.setPhone("00000000000");
                        peerUser.setOpenId(openId);
                        peerUser.setSessionKey(sessionKey);
                        peerUserMapper.insertSelective(peerUser);
                        userId = peerUser.getId();
                    } else {
                        userId = peerUsers.get(0).getId();
                    }

                    TbLogin tbLogin = new TbLogin();
                    tbLogin.setUserId(userId);
                    tbLogin.setToken(BaseUtil.uuidGen());
                    tbLogin.setExpireTime(Date.from(LocalDateTime.now().plusYears(5).atZone(ZoneId.systemDefault())
                            .toInstant()));
                    tbLoginMapper.insertSelective(tbLogin);
                    return BaseResponseVO.SuccessResponse(tbLogin);
                }
                return strResult;
            } else {
                throw new RuntimeException("微信获取信息失败");
            }

        } catch (IOException e) {
            logger.error("weixin http get error", e);
        }

        return null;
    }
}
