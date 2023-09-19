package com.pradiptoit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pradiptoit.services.ProductService;

@SpringBootApplication
public class DatajpaSpringProductApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(DatajpaSpringProductApplication.class, args);
		ProductService service= context.getBean(ProductService.class);
		service.QBExml();
		
	}

}
