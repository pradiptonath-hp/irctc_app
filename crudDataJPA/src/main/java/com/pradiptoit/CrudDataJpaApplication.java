package com.pradiptoit;

import org.springframework.boot.SpringApplication;
import com.pradiptoit.entity.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pradiptoit.repos.UserMasterRepo;
import com.pradiptoit.service.UserService;

@SpringBootApplication
public class CrudDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudDataJpaApplication.class, args);
		UserService  userService=context.getBean(UserService.class);
		//System.out.println(userService.getClass().getName());
		userService.saveUser();

	
	}

}
