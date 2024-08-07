package com.example.demo;

import cn.javastack.springboot.starter.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(TestService testService) {
        return (args) -> {
            log.info(testService.getServiceName());
            /**
             * 当application.yml文件中满足
             * javastack:
             *   starter:
             *     enabled: true
             * 时打印如下语句
             * 2024-07-29T22:54:12.316+08:00  INFO 2476 --- [           main] com.example.demo.DemoApplication         : java 技术栈
             */
        };
    }

}
