package com.eumji.aspect.handler;

import com.eumji.aspect.vo.LogInfo;
import com.eumji.aspect.repository.LogRepository;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * eumji.eumji.aspect.config.AspectHandler.java
 *
 * @desc 不积跬步无以至千里, 不积小流无以至千里
 * @author:EumJi
 * @year: 2017
 * @month: 04
 * @day: 01
 * @time: 2017/4/1
 */
@Aspect
@Component
public class AspectHandler {
    Logger logger = LoggerFactory.getLogger(AspectHandler.class);

    @Autowired
    private LogRepository logRepository;
    @Pointcut("execution(* com.eumji.aspect.controller.*.*(..))")
    public void aspect(){}

    @Before("aspect()")
    public void beforeAspect(JoinPoint joinPoint){
        logger.info("事前拦截时间:"+ LocalDateTime.now().toString());
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        logger.info("request url:"+request.getRequestURL().toString());
        logger.info("request header:"+request.getHeaderNames().toString());
        logger.info("request method:"+request.getMethod());
        logger.info("request IP:"+request.getRemoteAddr());
        logger.info("request classMethod:"+joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        logger.info("request args:"+ Arrays.toString(joinPoint.getArgs()));
        LogInfo logInfo = new LogInfo();
        logInfo.setUrl(request.getRequestURL().toString());
        logInfo.setHeader(request.getHeaderNames().toString());
        logInfo.setMethod(request.getMethod());
        logInfo.setIp(request.getRemoteAddr());
        logInfo.setClassMethod(joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        logInfo.setArges(Arrays.toString(joinPoint.getArgs()));
        logRepository.save(logInfo);
    }

    @AfterReturning(returning = "ret", pointcut = "aspect()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("RESPONSE : " + ret);
        logger.info("结束拦截时间 : " +LocalDateTime.now().toString());
    }

}
