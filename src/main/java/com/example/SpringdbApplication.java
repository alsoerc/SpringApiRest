package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.*"})
public class SpringdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdbApplication.class, args);
	}

}
