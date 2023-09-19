package com.pradiptoit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pradiptoit.SERVICE.SERVICE;

@SpringBootApplication
public class BooksJdbcAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BooksJdbcAppApplication.class, args);
		SERVICE bookService=context.getBean(SERVICE.class);
		bookService.processBook();
	}

}
