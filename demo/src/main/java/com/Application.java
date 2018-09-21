package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})禁用特定的自动配置类、jdbc自动配置时不能加这一句，否则读取不到jdbcTemplate,严重错误
//启用自动配置 该框架就能够进行行为的配置，以引导应用程序的启动与运行, 根据导入的starter-pom 自动加载配置
//@EnableAutoConfiguration
/*@ComponentScan(basePackages = "com.example.*")
@EntityScan("com.example.entity")
@EnableJpaRepositories(basePackages = "com.example.dao")*/
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
