package com.example.springboottemplate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboottemplate.mapper")//使用MapperScan批量扫描所有的Mapper接口；
public class SpringbootTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTemplateApplication.class, args);
    }

}
