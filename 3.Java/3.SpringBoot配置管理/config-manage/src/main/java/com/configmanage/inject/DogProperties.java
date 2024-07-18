package com.configmanage.inject;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "javastack")
public class DogProperties {

    private String username;

    private String password;
}
