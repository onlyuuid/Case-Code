package com.configmanage.inject;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

/**
 * 使用构造器方式绑定
 */
@Data
@NoArgsConstructor
@ConfigurationProperties(prefix = "cat")
public class CatProperties {

    private String name;

    private Integer age;

    private String color;

    private Date birthday;

    @ConstructorBinding
    public CatProperties(String name, Integer age, String color,@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date birthday) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.birthday = birthday;
    }
}

/**
 * 可以看出, 使用构造器的绑定方式也很简单, 可以将@ConfigurationProperties注解和@EnableConfigurationProperties
 * 使用, 如果有多个构造器,则使用@ConstructorBinding指定要使用的构造器, 只有一个构造器时可以不使用@ConstructorBinding注解
 * 但是, 这时只能进行简单的数据类型绑定, 像date类型就不行
 *
 * Failed to bind properties under 'cat.birthday' to java.util.Date:
 *
 *     Property: cat.birthday
 *     Value: "2022-02-06 15:23:45"
 *     Origin: class path resource [application-dev.yml] - 19:13
 *     Reason: failed to convert java.lang.String to java.util.Date (caused by java.lang.IllegalArgumentException)
 *
 * 建议不管是一个构造器还是多个构造器, 都加上@ConstructorBinding注解
 */
