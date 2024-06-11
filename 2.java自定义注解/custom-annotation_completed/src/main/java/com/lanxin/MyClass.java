package com.lanxin;

import com.lanxin.annotation.MyAnnotation;

/**
 * @author: WuPeng
 * @description: 测试类
 * @date: 2024/6/11 14:43
 */

public class MyClass {

    @MyAnnotation(value = "自定义注解", number = 10)
    public void test(){
        System.out.println("这是测试类代码>>");
    }
}
