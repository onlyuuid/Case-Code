package com.lanxin.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;

/**
 * @author: WuPeng
 * @description: 切面
 * @date: 2024/6/11 16:23
 */

public class LoggingAspect {

    @Before("execution(* com.lanxin.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("查询日志...");
    }
}
