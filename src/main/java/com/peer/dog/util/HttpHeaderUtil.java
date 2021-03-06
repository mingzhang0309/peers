package com.peer.dog.util;

/**
 * @author stephen.zhang
 * @date 2018/6/18.
 */
public class HttpHeaderUtil {
    public static String TOKEN = "token";

    public static String IP = "ip";

    public static String VERSION = "version";

    public static String NICK = "nick";

    private static ThreadLocal<String> threadLocalToken = new ThreadLocal<>();
    private static ThreadLocal<String> threadLocalIp = new ThreadLocal<>();
    private static ThreadLocal<String> threadLocalVersion = new ThreadLocal<>();
    private static ThreadLocal<Integer> threadLocalUserId = new ThreadLocal<>();
    private static ThreadLocal<String> threadLocalUserNick = new ThreadLocal<>();

    public static String getToken() {
        return threadLocalToken.get();
    }

    public static String getIp() {
        return threadLocalIp.get();
    }

    public static String getVersion() {
        return threadLocalVersion.get();
    }

    public static Integer getUserId() {
        return threadLocalUserId.get();
    }

    public static String getUserNick() {
        return threadLocalUserNick.get();
    }

    public static void setUserId(Integer userId) {
        threadLocalUserId.set(userId);
    }

    public static void setUserNick(String nick) {
        threadLocalUserNick.set(nick);
    }

    public static void clear() {
        threadLocalToken.remove();
        threadLocalIp.remove();
        threadLocalVersion.remove();
        threadLocalUserId.remove();
        threadLocalUserNick.remove();
    }

}
