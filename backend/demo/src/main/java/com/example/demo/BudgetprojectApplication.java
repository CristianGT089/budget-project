package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BudgetprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetprojectApplication.class, args);
	}

	@Configuration
	public class WebConfig implements WebMvcConfigurer {
		@Override
		public void addCorsMappings(@SuppressWarnings("null") CorsRegistry registry) {
			registry.addMapping("/**").allowedOrigins("http://localhost:4321");
		}
	}
	
	
}

