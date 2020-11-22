package com.abbey.myblog.controller;

import com.abbey.myblog.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lianying
 * @create 2020-11-21 8:59 下午
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUserById/id={id}")
    public String GetUser(@PathVariable int id){
//        long start = System.currentTimeMillis();
        // 采用多线程进行模拟
//        ExecutorService fixThreadPool = Executors.newFixedThreadPool(3);

        // 创建执行任务
//        Runnable runnable = () -> {
//            userService.Sel(id).toString();
//        };

        // 循环执行
//        for(int i = 0;i < 10000;i++){
//            fixThreadPool.execute(runnable);
//        }

        // 用来计算操作时间
        // fixThreadPool.shutdown();
//        long end;
//        while(true){
//            if(fixThreadPool.isTerminated()) {
//                end = System.currentTimeMillis() - start;
//                break;
//            }
//        }
//
//        return "程序运行时间为："+ end + "毫秒";
         return userService.Sel(id);
    }

}
