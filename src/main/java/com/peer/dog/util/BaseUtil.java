package com.peer.dog.util;

import java.util.UUID;

/**
 *
 * @author stephen.zhang
 * @date 2018/6/10
 */
public final class BaseUtil {
    public final static String uuidGen() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
