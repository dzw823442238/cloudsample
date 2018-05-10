package com.cloud.sample;

import com.cloud.sample.filter.PreRequestLogFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * 声明一个zuul代理，该代理使用Ribbon定位注册在Eureka Server 中的微服务，
 * 同时 该代理还整合了Hystrix,从而实现了容错，所以经过Zuul的请求都会在Hystrix命令中执行
 */
@SpringBootApplication
@EnableZuulProxy
public class SampleGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleGatewayZuulApplication.class, args);
	}

	@Bean
	public PreRequestLogFilter preRequestLogFilter(){
		return new PreRequestLogFilter();
	}
}
