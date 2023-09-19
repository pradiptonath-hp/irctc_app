package com.pradiptoit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pradiptoit.services.UserMasterServices;

@SpringBootApplication
public class CrudDataJpAv2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudDataJpAv2Application.class, args);
		UserMasterServices userMasterService = context.getBean(UserMasterServices.class);
		userMasterService.findbyvar();
		
	}

}
