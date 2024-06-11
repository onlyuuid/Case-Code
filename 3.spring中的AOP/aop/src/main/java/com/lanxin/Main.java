package com.lanxin;


import com.lanxin.proxy.ProxyObjectFactory;
import com.lanxin.service.UserService;
import com.lanxin.service.impl.UserServiceImpl;

public class Main  {

    public static void main(String[] args) {
        // 获取代理对象
        UserService proxyObject = (UserService) ProxyObjectFactory.getProxyObject(new UserServiceImpl());
        // 通过代理对象调用被代理对象中的方法
        proxyObject.login2("amdin","123456","127.0.0.1");
        proxyObject.getInfo();

        System.out.println();

        // 获取代理对象
        UserService proxyObject02 = (UserService) ProxyObjectFactory.getProxyObject2(new UserServiceImpl());
        // 通过代理对象调用被代理对象中的方法
        proxyObject02.login2("amdin2","1234567","127.0.0.1");
        proxyObject02.getInfo();

    }

}