package com.lanxin.aspect;

/**
 * @author: WuPeng
 * @description: 切面
 * @date: 2024/6/11 16:23
 */
public class LoggingAspect {

    public static void logBefore() {
        System.out.println("查询日志......");
    }

    public static void logAfter() {
        System.out.println("将ip写入日志......");
    }
}
