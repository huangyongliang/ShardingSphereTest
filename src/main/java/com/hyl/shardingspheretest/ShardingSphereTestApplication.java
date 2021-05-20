package com.hyl.shardingspheretest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

@SpringBootApplication(scanBasePackages = {"com.hyl.shardingspheretest.**"},exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.hyl.shardingspheretest.dao.mapper.**")
@ServletComponentScan
public class ShardingSphereTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereTestApplication.class, args);
    }

}
