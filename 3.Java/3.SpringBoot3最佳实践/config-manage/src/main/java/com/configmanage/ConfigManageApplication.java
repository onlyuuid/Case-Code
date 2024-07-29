package com.configmanage;

import com.configmanage.inject.*;
import com.configmanage.otherconfig.Configuration1;
import com.configmanage.otherconfig.Configuration2;
import com.configmanage.config.MainConfig;
import com.configmanage.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableConfigurationProperties(value = {PersonProperties.class, CatProperties.class})
@ConfigurationPropertiesScan(basePackages = "com.configmanage.inject")   // 扫描指定路径下的参数配置类
@RestController
public class ConfigManageApplication {

    private static final Logger log = LoggerFactory.getLogger(ConfigManageApplication.class);

    @Autowired
    private MainConfig mainConfig;

    @Autowired
    private Configuration1 configuration1;

    @Autowired
    private Configuration2 configuration2;

    @Autowired
    private UserService userService;

    @Autowired
    private PersonProperties personProperties;

    @Autowired
    private CatProperties catProperties;

    @Autowired
    private OtherMember otherMember;

    @Autowired
    private CarProperties carProperties;

    @Autowired
    private DogProperties dogProperties;

    public static void main(String[] args) {
        SpringApplication.run(ConfigManageApplication.class, args);
    }

    /**
     * CommandLineRunner在程序启动后执行一些特定的操作
     */
    @Bean
    public CommandLineRunner commandLineRunner() {
        return (args) -> {
            log.info(" user: {}",personProperties); //user: PersonProperties(name=[tom, jerry, mark], age=18, email=684723@qq.com, param={cell-phone=16689562356, address=guizhou}, configKey=ConfigKey(privateKey=fjsalfjlasf, publicKey=fjkasfkdahskfdjskdf))
            log.info(" cat: {}",catProperties); // cat: CatProperties(name=小黑, age=2, color=black, birthday=Sun Feb 06 15:23:45 CST 2022)
            log.info(" other: {}",otherMember); // other: OtherMember(name=李四, age=19, height=180)
            log.info(" car: {}",carProperties);
            log.info(" dog: {}",dogProperties);
        };
    }
















    @GetMapping("/test01")
    public String test01(){
        return configuration1.run01();
    }

    @GetMapping("/test02")
    public String test02(){
        return configuration2.run02();
    }

    @GetMapping("/test03")
    public String test03(){
        return mainConfig.run3();

    }

    @GetMapping("/test04")
    public String test04(){
        return userService.getUser();
    }



}
