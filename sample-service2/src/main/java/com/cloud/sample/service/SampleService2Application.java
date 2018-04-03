package com.cloud.sample.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class SampleService2Application {

	@RequestMapping(value = "/hello")
	public String hello(){
		return "hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleService2Application.class, args);
	}
}
