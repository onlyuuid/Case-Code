package com.lanxin;

import com.lanxin.annotation.MyAnnotation;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        method01(); // 在项目中通常使用AOP调用

        MyClass myClass = new MyClass();
        myClass.test();
    }

    // 方式一: 使用类名.class
    public static void method01(){
        Class<MyClass> myClassClass = MyClass.class;
        try {
            Method test = myClassClass.getMethod("test");
            if(test.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation annotation = test.getAnnotation(MyAnnotation.class);
                System.out.println("value =" + annotation.value());
                System.out.println("number =" + annotation.number());
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

}