package com.demo.springcloud_front;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.demo")
@EnableEurekaClient
@MapperScan("com.demo.dao")
public class SpringcloudFrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFrontApplication.class, args);
    }

}
