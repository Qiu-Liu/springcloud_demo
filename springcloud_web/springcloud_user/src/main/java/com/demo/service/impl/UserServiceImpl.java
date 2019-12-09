package com.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.dao.UserMapper;
import com.demo.entity.User;
import com.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuq
 * @Date 2019/12/9
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 通过id获得User
     * @param id
     * @return
     */
    @Override
    public User getUser(Integer id) {
        return userMapper.selectById(id);
    }

    /**
     * 通过id删除User
     * @param id
     * @return
     */
    @Override
    public int deleteUser(Integer id) {

        return userMapper.deleteById(id);
    }
    /**
     * 添加User
     * @param user
     * @return
     */
    @Override
    public int insertUser(User user) {
        System.out.println("获得对象："+user);
        return userMapper.insert(user);
    }
    /**
     * 修改User
     * @param user
     * @return
     */
    @Override
    public int updateUser(User user) {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",user.getId());
        return userMapper.update(user,queryWrapper);
    }


}
