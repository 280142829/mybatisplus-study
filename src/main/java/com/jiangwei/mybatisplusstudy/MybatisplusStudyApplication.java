package com.jiangwei.mybatisplusstudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jw
 * @create 2022-06-16 18:04
 */
@SpringBootApplication
@MapperScan(basePackages = "com.jiangwei.mybatisplusstudy.dao")
public class MybatisplusStudyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisplusStudyApplication.class);
    }
}
