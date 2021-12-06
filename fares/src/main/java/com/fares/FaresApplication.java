package com.fares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FaresApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaresApplication.class, args);
	}

}
