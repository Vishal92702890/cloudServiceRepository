package com.ensat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@EnableConfigServer
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class SpringBootWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }
}
