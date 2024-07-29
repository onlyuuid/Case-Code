package com.configmanage.inject;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "mail")
public class MailProperties {

    private String from;

    private String personal;

    private String bcc;

    private String subject;
}
