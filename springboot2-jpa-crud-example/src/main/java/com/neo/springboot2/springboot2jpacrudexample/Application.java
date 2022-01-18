package com.neo.springboot2.springboot2jpacrudexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.domain.EntityScan;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// @ComponentScan({ "com.neo.springboot2.springboot2jpacrudexample.controller"})
// @EntityScan("com.neo.springboot2.springboot2jpacrudexample.model")
// @EnableJpaRepositories("com.neo.springboot2.springboot2jpacrudexample.dao")
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
