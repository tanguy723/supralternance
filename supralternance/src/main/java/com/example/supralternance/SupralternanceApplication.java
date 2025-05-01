package com.example.supralternance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;



@SpringBootApplication(scanBasePackages = {
		"com.example.supralternance.candidatures.controller",
		"com.example.supralternance.candidatures.model",
		"com.example.supralternance.service",
		"com.example.supralternance.repository"})
@Configuration
public class SupralternanceApplication{


	public static void main(String[] args) {
		SpringApplication.run(SupralternanceApplication.class, args);
		
	}

	

}
