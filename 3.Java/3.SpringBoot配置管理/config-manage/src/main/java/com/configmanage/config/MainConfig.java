package com.configmanage.config;

import com.configmanage.inject.OtherMember;
import com.configmanage.otherconfig.Configuration1;
import com.configmanage.otherconfig.Configuration2;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootConfiguration
@Import({Configuration1.class, Configuration2.class})
@ImportResource("classpath:bean.xml")
public class MainConfig {

    /**
     * @Import 注解用于当SpringBoot无法扫描到目标文件, 或目标文件在jar包中的情况, 可以手动将目标文件导入Spring容器
     *
     */

    /**
     * @ImportResource 注解用于将xml中的bean注入到Spring容器, 它支持相对位置和绝对位置(有classpath为相对位置)
     */

    @Bean
    public String run3() {
        return "配置3";
    }

    @Bean
    @ConfigurationProperties(prefix = "member")
    public OtherMember otherMember() {
        return new OtherMember();
    }

    /**
     * 使用bean绑定, 这种方式只能绑定简单的类型, 像date这种类型就没有对应的解决方案了
     */


}
