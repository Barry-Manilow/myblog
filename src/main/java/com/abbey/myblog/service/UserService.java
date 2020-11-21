package com.abbey.myblog.service;

import com.abbey.myblog.mapper.UserMapper;
import com.abbey.myblog.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lianying
 * @create 2020-11-21 9:02 下午
 **/

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
}
