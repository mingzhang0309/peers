package com.peer.dog.pojo;

import com.peer.dog.exception.ErrorCode;

import java.io.Serializable;

/**
 * @author zhangming
 * @version: 1.0
 */
public class BaseResponseVO<T> implements Serializable {
    private static final long serialVersionUID = 6893034599138936865L;

    /**
     * 0是成功
     */
    private int status = 0;

    private String message = "";

    private String nextHref;

    private T data;

    public BaseResponseVO() {
    }

    public BaseResponseVO(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static <T> BaseResponseVO SuccessResponse(T data) {
        BaseResponseVO baseResponseVO = new BaseResponseVO();
        baseResponseVO.status = 0;
        baseResponseVO.message = "";
        baseResponseVO.data = data;
        return baseResponseVO;
    }

    public static BaseResponseVO FailureResponse(String message) {
        BaseResponseVO baseResponseVO = new BaseResponseVO();
        baseResponseVO.status = -1;
        baseResponseVO.message = message;
        return baseResponseVO;
    }

    public static BaseResponseVO FailureResponse(ErrorCode errorCode) {
        BaseResponseVO baseResponseVO = new BaseResponseVO();
        baseResponseVO.status = errorCode.getCode();
        baseResponseVO.message = errorCode.getMessage();

        if(errorCode == ErrorCode.NO_INFO) {
            baseResponseVO.setNextHref("/user/pass");
        }
        return baseResponseVO;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getNextHref() {
        return nextHref;
    }

    public void setNextHref(String nextHref) {
        this.nextHref = nextHref;
    }

    @Override
    public String toString() {
        return "BaseResponseVO{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", nextHref='" + nextHref + '\'' +
                ", data=" + data +
                '}';
    }
}
