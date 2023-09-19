package com.ashokit.jpa;
import com.ashokit.jpa.entities.*;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.jpa.repository.BookLandRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		BookLandRepo landRepo = context.getBean(BookLandRepo.class);
		/*BookLand entity= new BookLand();
		entity.setBookName("Asp dot net");
		entity.setBookPrice(2000.00);
		entity.setBookCompany("S Chand");
		entity.setActiveSw("T");
		
		BookLand savedBook = landRepo.save(entity);
		System.out.println(savedBook);*/
		
	/*	BookLand bookUpdate = landRepo.findById(1).get();
		bookUpdate.setActiveSw("F");
		landRepo.save(bookUpdate);
	*/
		landRepo.updateBook(2,"Laravel");
		
	}
}
