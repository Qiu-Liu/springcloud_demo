package com.demo.springcloud_admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.demo")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.demo.feign")
public class SpringcloudAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAdminApplication.class, args);
    }

}
