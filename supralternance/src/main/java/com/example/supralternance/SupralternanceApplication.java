package com.example.supralternance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"candidatures.controller", "candidatures.model", "service"})
@Configuration
@EnableJpaRepositories("com.example.supralternance.repository")
public class SupralternanceApplication{


	public static void main(String[] args) {
		SpringApplication.run(SupralternanceApplication.class, args);
		
	}



}
