package com.configmanage;

import com.configmanage.otherconfig.Configuration1;
import com.configmanage.otherconfig.Configuration2;
import com.configmanage.config.MainConfig;
import com.configmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigManageApplication {

    @Autowired
    private MainConfig mainConfig;

    @Autowired
    private Configuration1 configuration1;

    @Autowired
    private Configuration2 configuration2;

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(ConfigManageApplication.class, args);
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
