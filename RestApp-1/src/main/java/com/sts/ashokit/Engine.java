package com.sts.ashokit;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
	 System.out.println("Engine constructor:Executed");
	}
	
	public int start() {
		System.out.println("Starting engine..");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println("Engine started");
		return 1;
	}
}
