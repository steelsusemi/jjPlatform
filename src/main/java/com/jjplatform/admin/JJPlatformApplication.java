package com.jjplatform.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@MapperScan(basePackages = "com.jjplatform.admin") 
@SpringBootApplication(scanBasePackages={"com.jjplatform", "com.jjplatform.admin"})
@PropertySource({ "classpath:/config/application.yml"
//				, "classpath:/config/application.properties"
				, "classpath:/config/application-${spring.profiles.active}.yml"
//				, "classpath:/config/application-service-${spring.profiles.active}.yml"
//				, "classpath:/config/application-core-${spring.profiles.active}.yml"
				})
public class JJPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(JJPlatformApplication.class, args);
    }
}
