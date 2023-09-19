package com.sts.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Car {
	
	@Autowired
	private Engine eng;
	
	public Car() {
		System.out.println("Car constructor executed...");
	}
	
	public void drive() {
	int start=eng.start();
	if(start>=1) {
		System.out.println("Driving ...");
	}
	}
	
}
