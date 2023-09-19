package com.pradipto.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class Bike implements ApplicationRunner {
	private Engine eng;
	
	@Autowired
	public Bike(Engine eng) {
		this.eng=eng;
		System.out.println("Bike Constructor running");
	}
	
	//@Autowired
	//public void setEng(Engine eng) {
	//	this.eng = eng;}
	
	
	
	public void startBike() {
		int start= eng.start();
		if(start>=1) {
			System.out.println("Bike started..Riding bike now");
		}
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Application Runner");
	}
}
