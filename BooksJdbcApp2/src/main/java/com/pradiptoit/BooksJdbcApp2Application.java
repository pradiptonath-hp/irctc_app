package com.pradiptoit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pradiptoit.service.bookService;

@SpringBootApplication
public class BooksJdbcApp2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BooksJdbcApp2Application.class, args);
		bookService bs=context.getBean(bookService.class);
		bs.processBook();
	}

}
