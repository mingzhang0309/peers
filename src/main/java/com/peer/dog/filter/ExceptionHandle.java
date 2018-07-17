package com.peer.dog.filter;

import com.peer.dog.exception.ErrorCode;
import com.peer.dog.exception.PeerException;
import com.peer.dog.pojo.BaseResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author stephen.zhang
 * @date 2018/6/22.
 */
@ControllerAdvice
public class ExceptionHandle {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResponseVO Handle(Exception e){
        logger.error("异常信息", e);

        if (e instanceof PeerException) {
            return BaseResponseVO.FailureResponse(((PeerException) e).getErrorCode());
        }
        return BaseResponseVO.FailureResponse(ErrorCode.SYSTEM_ERROR);
    }
}
