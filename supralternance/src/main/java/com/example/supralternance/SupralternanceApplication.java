package com.example.supralternance;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import jakarta.persistence.EntityManagerFactory;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@Configuration
@EnableJpaRepositories("com.example.supralternance.repository")
public class SupralternanceApplication{


	public static void main(String[] args) {
		SpringApplication.run(SupralternanceApplication.class, args);
		
	}

	@Bean
	public EntityManagerFactory entityManagerFactory() {
  		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
  		factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
  		factory.setPackagesToScan("com.example.supralternance.candidatures.model");
  		factory.setDataSource(dataSource());
  		factory.afterPropertiesSet();
 
  		return factory.getObject();
	}
	
	@Bean
	public DataSource dataSource() {
  		DriverManagerDataSource dataSource = new DriverManagerDataSource();
  		dataSource.setDriverClassName("org.postgresql.Driver");
  		dataSource.setUrl("jdbc:postgresql://localhost:5432/supralternance");
  		dataSource.setUsername("root");
  		dataSource.setPassword("root");
 
  		return dataSource;
}

}
