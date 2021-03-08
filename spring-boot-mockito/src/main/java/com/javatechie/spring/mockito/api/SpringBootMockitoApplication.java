package com.javatechie.spring.mockito.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.javatechie.spring.mockito.api")
@SpringBootApplication
public class SpringBootMockitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMockitoApplication.class, args);
	}
}
