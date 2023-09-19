package com.pradiptoit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pradiptoit.service.EmployeeService;

@SpringBootApplication
public class O2MMappingsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(O2MMappingsApplication.class, args);
		EmployeeService service = context.getBean(EmployeeService.class);
		service.saveData();
	}

}
