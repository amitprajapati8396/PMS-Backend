package com.pms.procedure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PmsProcedureApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsProcedureApplication.class, args);
	}

}
