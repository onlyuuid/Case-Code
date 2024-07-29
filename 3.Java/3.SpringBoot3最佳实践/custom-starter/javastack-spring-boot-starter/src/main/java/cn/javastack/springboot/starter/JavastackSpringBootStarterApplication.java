package cn.javastack.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavastackSpringBootStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavastackSpringBootStarterApplication.class, args);
    }

    /**
     * 将本地jar包安装到本地maven
     * mvn install:install-file -D file=javastack-spring-boot-starter-1.0.jar
     *                          -D groupId=cn.javastack
     *                          -D artifactId=javastack-spring-boot-starter
     *                          -D version=1.0
     *                          -D packaging=jar
     */

}
