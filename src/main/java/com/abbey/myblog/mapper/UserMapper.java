package com.abbey.myblog.mapper;

import org.springframework.stereotype.Repository;
import com.abbey.myblog.entity.*;
/**
 * @author lianying
 * @create 2020-11-21 9:09 下午
 **/

@Repository
public interface UserMapper {
    User Sel(int id);
}
