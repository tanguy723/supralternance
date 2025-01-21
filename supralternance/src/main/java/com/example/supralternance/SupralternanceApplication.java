package com.example.supralternance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@Configuration
public class SupralternanceApplication implements CommandLineRunner {

	@Autowired
	private candidatureService candidatureService;
	
	public static void main(String[] args) {
		SpringApplication.run(SupralternanceApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'run'");
	}

}
