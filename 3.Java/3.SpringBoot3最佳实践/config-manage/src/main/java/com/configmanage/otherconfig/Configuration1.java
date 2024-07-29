package com.configmanage.otherconfig;


import org.springframework.context.annotation.Bean;

public class Configuration1 {

    @Bean
    public String run01(){
        return "配置1";
    }

}
