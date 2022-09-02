package com.example.FancyDogMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // is optional when spring-cloud-starter-netflix-eureka-client is part of the dependencies
public class FancyDogMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FancyDogMicroserviceApplication.class, args);
	}

}
