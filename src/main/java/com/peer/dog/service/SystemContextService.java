package com.peer.dog.service;

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
    String appId = null;

    String appSecret = null;

    @PostConstruct
    public void init() throws IOException {
        try {
            Properties properties = new Properties();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/admin/peer.properties"));
            properties.load(bufferedReader);

            appId = properties.getProperty("appId");
            appSecret = properties.getProperty("appSecret");
        } catch (IOException e) {
            throw e;
        }
    }

    public String getAppId() {
        return appId;
    }

    public String getAppSecret() {
        return appSecret;
    }
}
