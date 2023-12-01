package com.hexaware.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkingAppApplication.class, args);
		System.out.println("Spring boot app by Rajat");
	}

}
