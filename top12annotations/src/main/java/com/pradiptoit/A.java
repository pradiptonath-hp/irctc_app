package com.pradiptoit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class A {

	public A() {
		System.out.println("A constructor: running");
	}
	
	@Bean
	public B createBean() {
		System.out.println(" BEAN executed");
		return new B();
	}
	
	

}
