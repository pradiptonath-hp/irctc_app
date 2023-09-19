package com.pradiptoit;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pradiptoit.repository.ProductRepo;
import com.pradiptoit.entities.*;
@SpringBootApplication
public class CreateUpdateDateApplication {
	private ProductRepo repo;
	public CreateUpdateDateApplication(ProductRepo repo) {
		
		this.repo = repo;
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CreateUpdateDateApplication.class, args);
		ProductRepo productRepo = context.getBean(ProductRepo.class);
		
		Product entity0 = new Product();
		Product entity1 = new Product();
		Product entity2 = new Product();
		Product entity3 = new Product();
		Product entity4 = new Product();

		entity0.setpName("Alto");
		entity0.setpPrice(20000.00);
		entity0.setpType("Four Wheeler");
		
		entity1.setpName("Baleno");
		entity1.setpPrice(30000.00);
		entity1.setpType("Four Wheeler");
		
		entity2.setpName("Jupiter");
		entity2.setpPrice(10000.00);
		entity2.setpType("Two Wheeler");
		
		entity3.setpName("Maestro");
		entity3.setpPrice(8000.00);
		entity3.setpType("Two Wheeler");
		
		entity4.setpName("Scorpio");
		entity4.setpPrice(30000.00);
		entity4.setpType("Four Wheeler");
		
		productRepo.saveAll(Arrays.asList(entity0,entity1,entity2,entity3,entity4));
		System.out.println("Done. . . .");
		
	}
}
