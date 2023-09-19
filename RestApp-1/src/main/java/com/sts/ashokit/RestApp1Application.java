package com.sts.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RestApp1Application.class, args);
		Car car= context.getBean(Car.class);
		car.drive();
		
		Car car1=context.getBean(Car.class);
		car1.drive();
		
		System.out.println(car.hashCode());
		System.out.println(car1.hashCode());
		
		//Engine eng = context.getBean(Engine.class);
		//eng.start();
		
	}
}
