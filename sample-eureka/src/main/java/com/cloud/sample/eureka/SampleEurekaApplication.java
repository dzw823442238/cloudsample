package com.cloud.sample.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SampleEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleEurekaApplication.class, args);
	}
}
