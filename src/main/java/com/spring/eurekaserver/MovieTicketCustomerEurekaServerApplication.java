package com.spring.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MovieTicketCustomerEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketCustomerEurekaServerApplication.class, args);
		System.out.println("Movie Ticket Customer Eureka Server Running.");
	}

}
