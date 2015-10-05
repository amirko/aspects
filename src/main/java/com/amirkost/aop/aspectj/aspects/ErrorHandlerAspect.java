package com.amirkost.aop.aspectj.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 28/09/2015.
 */
@Aspect
public class ErrorHandlerAspect {

    private static Logger logger = LoggerFactory.getLogger(ErrorHandlerAspect.class);

    @AfterThrowing(pointcut = "execution(* com.amirkost.aop.aspectj..*.* (..))", throwing = "e")
    public void handleError(Throwable e) {
        logger.error("--- AOP INTERCEPTED ERROR ---", e);
    }
}
