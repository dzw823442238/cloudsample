package com.cloud.sample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableDiscoveryClient
@MapperScan("com.cloud.sample.dao")
@SpringBootApplication(exclude = JtaAutoConfiguration.class)
public class SampleServiceShardingJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleServiceShardingJdbcApplication.class, args);
	}
}
