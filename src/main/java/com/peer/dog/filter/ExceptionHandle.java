package com.peer.dog.filter;

import com.peer.dog.pojo.BaseResponseVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author stephen.zhang
 * @date 2018/6/22.
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResponseVO Handle(Exception e){
        return BaseResponseVO.FailureResponse(e.getMessage());
    }
}
