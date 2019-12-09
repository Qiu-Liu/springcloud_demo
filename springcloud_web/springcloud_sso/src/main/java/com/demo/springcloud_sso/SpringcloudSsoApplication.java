package com.demo.springcloud_sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.demo")
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.demo.feign")
public class SpringcloudSsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudSsoApplication.class, args);
    }

}
