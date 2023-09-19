package com.pradiptoit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Top12annotationsApplication implements CommandLineRunner {
	
	@Autowired
	private B b;
	
	@Autowired
	private Emp emp;
	
	public static void main(String[] args)  {
		SpringApplication.run(Top12annotationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.b.B_running();
		this.emp.Your_name();
		
	}
	
	

}
