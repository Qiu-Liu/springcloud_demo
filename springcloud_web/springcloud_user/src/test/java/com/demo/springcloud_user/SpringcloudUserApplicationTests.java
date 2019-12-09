package com.demo.springcloud_user;

import com.demo.entity.User;
import com.demo.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringcloudUserApplicationTests {
    @Autowired
    private IUserService userService;
    @Test
    void contextLoads() {
    }
    @Test
    void demoTest(){
        User user = userService.getUser(1);
        System.out.println(user);
    }
}
