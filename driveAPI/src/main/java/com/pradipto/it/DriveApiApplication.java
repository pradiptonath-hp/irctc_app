package com.pradipto.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DriveApiApplication {


	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(DriveApiApplication.class, args);
	Bike bike = context.getBean(Bike.class);
	
	bike.startBike();
	}
}
