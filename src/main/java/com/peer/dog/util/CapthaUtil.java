package com.peer.dog.util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author stephen.zhang
 * @date 2018/6/18.
 */
public class CapthaUtil {
    static Random random = new Random(9999);

    public static String generate() {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        StringBuilder code = new StringBuilder(4);
        code.append(threadLocalRandom.nextInt(9));
        code.append(threadLocalRandom.nextInt(9));
        code.append(threadLocalRandom.nextInt(9));
        code.append(threadLocalRandom.nextInt(9));
        return code.toString();
    }
}
