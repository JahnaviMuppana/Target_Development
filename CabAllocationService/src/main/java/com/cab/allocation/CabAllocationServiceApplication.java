package com.cab.allocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cab.allocation.config")
public class CabAllocationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabAllocationServiceApplication.class, args);
	}
}
