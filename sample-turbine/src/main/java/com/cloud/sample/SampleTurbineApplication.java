package com.cloud.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class SampleTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleTurbineApplication.class, args);
	}
}
