package com.abbey.myblog.service;

import com.abbey.myblog.mapper.UserMapper;
import com.abbey.myblog.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

/**
 * @author lianying
 * @create 2020-11-21 9:02 下午
 **/

@Service
public class UserService {
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    UserMapper userMapper;
    public String Sel(int id){

        String user = stringRedisTemplate.opsForValue().get(""+id);
        // 防止首次访问该接口有大量用户，造成内存穿透，使redis没有效果
        if(null == user){
            synchronized (this){
                if(null == user){
                    System.out.println("从mysql中查询数据中。。。。。。");
                    // 从数据库中查询数据
                    user = userMapper.Sel(id).toString();
                    System.err.println(user);
                    // 放入redis
                    redisTemplate.opsForValue().set(""+id,user);
                }
            }
        }else{
            System.out.println("从redis中查询数据中。。。。。。");
        }

        return user;
    }
}
