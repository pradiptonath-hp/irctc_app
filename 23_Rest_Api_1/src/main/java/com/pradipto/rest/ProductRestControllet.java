package com.pradipto.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pradipto.binding.Product;

@RestController
public class ProductRestControllet {

	@GetMapping("/product")
	public Product getProduct() {
	Product product = new Product(1,"Keyboard",2000.00); 
	return product;
	
	}
}


