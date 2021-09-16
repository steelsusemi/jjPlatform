package com.jjplatform.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.jjplatform.admin") 
public class JJPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(JJPlatformApplication.class, args);
    }
}
