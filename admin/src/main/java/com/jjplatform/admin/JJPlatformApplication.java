package com.jjplatform.admin;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
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
public class JJPlatformApplication extends SpringBootServletInitializer implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JJPlatformApplication.class, args);
    }
    
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(JJPlatformApplication.class);
	}
	
	@Override
	public void run(String... args) throws Exception {
		StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
		pbeEnc.setAlgorithm("PBEWithMD5AndDES");
		pbeEnc.setPassword("ztxHSTBWuMmdi/Eu9yN1vzGAUEOD5JZPq2ayFr5lzwI="); //2번 설정의 암호화 키를 입력
		
		// DB 암호화
		String driveEnc = pbeEnc.encrypt("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
//			String urlEnc = pbeEnc.encrypt("jdbc:log4jdbc:sqlserver://192.168.0.10:3727;databasename=UGIWEB");
		String urlEnc = pbeEnc.encrypt("jdbc:log4jdbc:mysql://127.0.0.1:3306/adminBoot?autoReconnect=true&verifyServerCertificate=false&useSSL=false");
		String userNameEnc = pbeEnc.encrypt("adminBoot");
		String passwordEnc = pbeEnc.encrypt("akfls5315!@");
		System.out.println("driveEnc = " + driveEnc);
		System.out.println("urlEnc = " + urlEnc);
		System.out.println("userNameEnc = " + userNameEnc);
		System.out.println("passwordEnc = " + passwordEnc);
		
		// DB 복호화
		String driveDes = pbeEnc.decrypt(driveEnc);
		String urlDes = pbeEnc.decrypt(urlEnc);
		String userNameDes = pbeEnc.decrypt(userNameEnc);
		String passwordDes = pbeEnc.decrypt(passwordEnc);
		System.out.println("driveDes = " + driveDes);
		System.out.println("urlDes = " + urlDes);
		System.out.println("userNameDes = " + userNameDes);
		System.out.println("passwordDes = " + passwordDes);
	}
}
