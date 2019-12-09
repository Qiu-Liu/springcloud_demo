package com.demo.service.impl;

import com.demo.dao.UserMapper;
import com.demo.entity.User;
import com.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuq
 * @Date 2019/12/3
 */
@Service
public class UserServiceImpl  implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public int updateUserAge(Integer id) {
        return userMapper.updateUserAge(id);
    }


}
