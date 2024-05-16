package com.first.eurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
		System.out.println(">  Eureka Server Started");
		final Logger logger = LoggerFactory.getLogger(EurekaServerApplication.class);
		
		logger.error("error aali re bhai...");
	}

}
