package com.cde.enablement.hystrixredisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableRedisRepositories
@EnableCaching
public class HystrixRedisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixRedisDemoApplication.class, args);
	}

}