package com.cloud.sample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.cloud.sample.dao")
public class SampleService1Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleService1Application.class, args);
	}
}
