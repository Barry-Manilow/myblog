package com.abbey.myblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.abbey.myblog.mapper")
@SpringBootApplication
public class MyblogApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyblogApplication.class, args);
    }
}
