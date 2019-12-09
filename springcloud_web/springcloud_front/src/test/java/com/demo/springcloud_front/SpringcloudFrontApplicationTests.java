package com.demo.springcloud_front;

import com.demo.entity.User;
import com.demo.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class SpringcloudFrontApplicationTests {

    @Autowired
    private StringRedisTemplate redisTemplate;


    @Autowired
    private IUserService userService;
    @Test
    void contextLoads() {
    }
    @Test
    void getUser(){
        User user = userService.getUser(1);
        System.out.println(user);
    }
    @Test
    void delete(){
        userService.deleteUserById(1);
    }



}
