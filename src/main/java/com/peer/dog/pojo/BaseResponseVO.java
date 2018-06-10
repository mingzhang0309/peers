package com.peer.dog.pojo;

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
        baseResponseVO.message = "";
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

    @Override
    public String toString() {
        return "BaseResponseVO{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
