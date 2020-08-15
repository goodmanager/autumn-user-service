package com.autumn.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.autumn")
@EnableDiscoveryClient
@MapperScan(value = { "com.autumn.user.dao" })
public class AutumnUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutumnUserApplication.class, args);
	}

}
