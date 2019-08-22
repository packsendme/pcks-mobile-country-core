package com.packsendme.microservice.country;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceCountryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCountryServerApplication.class, args);
	}
}
