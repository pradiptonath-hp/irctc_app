package com.pradipto.it;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Engine implements CommandLineRunner {

	public Engine() {
		System.out.println("Engine Constructor:Running");
	}
	public int start() {
		return 1;
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Command Line Runner");
		
	}
}
