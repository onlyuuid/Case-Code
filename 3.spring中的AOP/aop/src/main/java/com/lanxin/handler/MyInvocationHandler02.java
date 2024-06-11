package com.lanxin.handler;

import com.lanxin.aspect.LoggingAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: WuPeng
 * @description:
 * @date: 2024/6/11 20:50
 */

public class MyInvocationHandler02 implements InvocationHandler {

    /**
     * 被代理对象
     */
    private Object target;

    public MyInvocationHandler02(Object target) {
        this.target = target;
    }

    /**
     * 调用被代理对象中的方法
     * @param proxy 生成的代理对象
     * @param method 正在执行的方法
     * @param args 方法参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        LoggingAspect.logBefore();
        return method.invoke(target, args);
    }
}
