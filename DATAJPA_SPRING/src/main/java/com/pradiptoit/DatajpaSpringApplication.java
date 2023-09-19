package com.pradiptoit;
import com.pradiptoit.entities.*;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pradiptoit.service.UserMasterClassService;

@SpringBootApplication
public class DatajpaSpringApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext  context= 	SpringApplication.run(DatajpaSpringApplication.class, args);
	UserMasterClassService user =context.getBean(UserMasterClassService.class);
	
	//user.test_findByMethods();
	user.test();
	}
	
}
