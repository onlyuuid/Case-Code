package com.lanxin.proxy;

import com.lanxin.handler.MyInvocationHandler;
import com.lanxin.handler.MyInvocationHandler02;

import java.lang.reflect.Proxy;

/**
 * @author: WuPeng
 * @description: 通过动态代理创建代理对象
 * @date: 2024/6/11 20:03
 */
public class ProxyObjectFactory {

    /**
     * 获取代理对象
     * @param target 被代理对象
     * @return 代理对象
     */
    public static Object getProxyObject(Object target) {
        MyInvocationHandler invocationHandler = new MyInvocationHandler(target);
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        /**
         * 参数1: 被代理对象的类加载器
         * 参数2: 被代理对象所实现的接口
         * 参数3: 执行器
         */
        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }

    /**
     * 获取代理对象
     * @param target 被代理对象
     * @return 代理对象
     */
    public static Object getProxyObject2(Object target) {
        MyInvocationHandler02 invocationHandler = new MyInvocationHandler02(target);
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        /**
         * 参数1: 被代理对象的类加载器
         * 参数2: 被代理对象所实现的接口
         * 参数3: 执行器
         */
        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
}
