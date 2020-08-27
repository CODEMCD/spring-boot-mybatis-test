package com.codemcd.springbootmybatistest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.codemcd.springbootmybatistest")
public class SpringBootMybatisTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisTestApplication.class, args);
    }

}
