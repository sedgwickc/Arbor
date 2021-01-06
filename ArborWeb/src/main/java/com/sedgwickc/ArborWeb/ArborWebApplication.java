package com.sedgwickc.ArborWeb;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ArborWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArborWebApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLIneRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Inspecting beans provided by Spring Boot:");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}

}
