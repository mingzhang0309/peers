package com.peer.dog.exception;

/**
 * @author stephen.zhang
 * @date 2018/7/17.
 */
public enum ErrorCode {
    SYSTEM_ERROR(-1, "系统错误"),

    NO_LOGIN(0, "用户未登陆"),
    NO_INFO(1, "用户未录制信息"),
    CAPTCHA_ERROE(2, "验证码错误"),

    PASSWORD_ERROR(3, "账号或密码错误"),
    PASSWORD_EMPTY(4, "密码不能为空"),
    NO_TOKEN(5, "token缺失"),

    NONONO(100, "占位")
    ;

    int code;

    String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
