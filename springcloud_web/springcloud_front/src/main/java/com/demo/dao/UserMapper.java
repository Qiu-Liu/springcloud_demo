package com.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.entity.User;

/**
 * @author liuq
 * @Date 2019/12/3
 */
public interface UserMapper extends BaseMapper<User> {

    void deleteUserById(Integer id);


    int updateUserAge(Integer id);
}
