package com.peer.dog.aop;

import com.alibaba.fastjson.JSON;
import com.peer.dog.exception.PeerException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.UUID;

/**
 * @author stephen.zhang
 * @date 2018/9/24.
 */
@Aspect
@Component
public class LogInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(LogInterceptor.class);

    @Pointcut("execution(public * com.peer.dog.controller.*.*(..))")
    public void webLog() {

    }

    @Around("webLog()")
    public Object arround(ProceedingJoinPoint pjp) {
        Object o = null;
        try {
            // 接收到请求，记录请求内容
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder
                    .getRequestAttributes();
            HttpServletRequest request = attributes.getRequest();
            String trace = UUID.randomUUID().toString();
            logger.info("request {} {} {} {} {} {} {} {}", trace, request.getRequestURL().toString(), request.getMethod(),
                    request.getRemoteAddr(), pjp.getSignature().getDeclaringTypeName(), pjp.getSignature().getName(),
                    Arrays.toString(pjp.getArgs()), request.getContentType());

            o = pjp.proceed();

            logger.info("response {} {}", trace, JSON.toJSONString(o));
        } catch (Throwable throwable) {
            logger.error("", throwable);
            if(throwable instanceof PeerException) {
                throw (PeerException)throwable;
            }
            throw new RuntimeException(throwable);
        }
        return o;
    }
}
