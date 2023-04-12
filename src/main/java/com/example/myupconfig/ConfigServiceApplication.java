package com.example.myupconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServiceApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigServiceApplication.class);
    public static void main(String[] args) {
        LOGGER.info("start app");
        SpringApplication.run(ConfigServiceApplication.class, args);
    }
}
