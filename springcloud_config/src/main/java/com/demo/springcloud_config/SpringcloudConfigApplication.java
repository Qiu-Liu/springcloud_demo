package com.demo.springcloud_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringcloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigApplication.class, args);
    }

}
