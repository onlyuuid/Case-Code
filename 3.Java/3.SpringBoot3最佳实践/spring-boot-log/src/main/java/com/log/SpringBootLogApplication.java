package com.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootLogApplication {

    public static void main(String[] args) {
        System.setProperty("LOG_PATH","./logs");
        System.setProperty("LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE","1KB");
        SpringApplication.run(SpringBootLogApplication.class, args);
    }

    private static final Log logger1 = LogFactory.getLog(SpringBootLogApplication.class);

    private static final Logger logger2 = LoggerFactory.getLogger(SpringBootLogApplication.class);

    @Bean
    public CommandLineRunner commandLineRunner() {
        return (args) -> {
          logger1.error("commons logging error...");
          logger1.info("commons logging info...");
          logger1.debug("commons logging debug...");

          logger2.error("slf4j error...");
          logger2.info("slf4j info...");
          logger2.debug("slf4j debug...");
        };
    }

}
