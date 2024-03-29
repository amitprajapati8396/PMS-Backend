package com.pms.medication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PmsMedicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsMedicationApplication.class, args);
	}

}
