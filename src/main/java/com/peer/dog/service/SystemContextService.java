package com.peer.dog.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author stephen.zhang
 * @date 2018/7/7.
 */
@Service
public class SystemContextService {
    private static final Logger logger = LoggerFactory.getLogger(SystemContextService.class);

    String appId = null;

    String appSecret = null;

    String accessKeyId = "xxx";

    String accessKeySecret = "xxx";

    @PostConstruct
    public void init() throws IOException {
        try {
            Properties properties = new Properties();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/admin/peer.properties"));
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/zhangming/Desktop/宠物说/线上配置/peer.properties"));
            properties.load(bufferedReader);

            appId = properties.getProperty("appId");
            appSecret = properties.getProperty("appSecret");
            accessKeyId = properties.getProperty("accessKeyId");
            accessKeySecret = properties.getProperty("accessKeySecret");
        } catch (IOException e) {
            logger.error("系统异常", e);
            throw e;
        }
    }

    public String getAppId() {
        return appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }
}
