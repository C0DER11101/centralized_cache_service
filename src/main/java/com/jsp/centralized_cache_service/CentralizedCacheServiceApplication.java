package com.jsp.centralized_cache_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CentralizedCacheServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralizedCacheServiceApplication.class, args);
	}

}
