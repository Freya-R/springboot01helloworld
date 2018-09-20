package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})禁用特定的自动配置类、jdbc自动配置时不能加这一句，否则读取不到jdbcTemplate,严重错误
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
