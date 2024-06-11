package com.lanxin.handler;

import com.lanxin.aspect.LoggingAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: WuPeng
 * @description:  调用处理器
 * @date: 2024/6/11 20:07
 */
public class MyInvocationHandler implements InvocationHandler {

    /**
     * 被代理对象
     */
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 生成的代理对象
     * @param method 正在执行的方法
     * @param args 方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        LoggingAspect.logBefore();
        Object invoke = method.invoke(target, args); // 调用原对象方法
        LoggingAspect.logAfter();
        return invoke;
    }
}
