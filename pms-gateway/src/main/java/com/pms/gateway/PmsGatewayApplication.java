package com.pms.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableEurekaClient
@CrossOrigin(origins = "http://localhost:4200/*")

public class PmsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsGatewayApplication.class, args);
	}

}
