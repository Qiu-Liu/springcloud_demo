package com.demo.springcloud_user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.demo")
@EnableDiscoveryClient
@MapperScan("com.demo.dao")
public class SpringcloudUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudUserApplication.class, args);
    }

}
