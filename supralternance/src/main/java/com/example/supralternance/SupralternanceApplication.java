package com.example.supralternance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;



@SpringBootApplication(scanBasePackages = {"candidatures.controller", "candidatures.model", "candidatures.service", "candidatures.repository"})
@Configuration
@EnableAutoConfiguration
public class SupralternanceApplication{


	public static void main(String[] args) {
		SpringApplication.run(SupralternanceApplication.class, args);
		
	}

	

}
