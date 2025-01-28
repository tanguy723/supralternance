package com.example.supralternance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@Configuration
public class SupralternanceApplication{


	public static void main(String[] args) {
		SpringApplication.run(SupralternanceApplication.class, args);
		
	}

}
