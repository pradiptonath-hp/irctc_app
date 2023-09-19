package com.pradiptoit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pradiptoit.services.UserService;

@SpringBootApplication
public class FindByMethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FindByMethodsApplication.class, args);
		
		UserService userService=context.getBean(UserService.class);
		userService.QueryAnnotation();
	}

}
