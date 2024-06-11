package com.lanxin.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: WuPeng
 * @description: 自定义注解
 * @date: 2024/6/11 14:30
 */
@Target(ElementType.METHOD)          // 定义注解使用范围
//@Retention(RetentionPolicy.CLASS)  // 定义生命周期为类加载时
//@Retention(RetentionPolicy.SOURCE) // 表示只在源码中保留, 在编译过程中会被丢弃
@Retention(RetentionPolicy.RUNTIME)  // 定义生命周期为运行时
//@Documented：指定注解是否会包含在Javadoc中。
//@Inherited：指定注解是否会被子类继承。
public @interface MyAnnotation {

    String value() default "你好, 我是自定义注解词";

    int number() default 0;
}
