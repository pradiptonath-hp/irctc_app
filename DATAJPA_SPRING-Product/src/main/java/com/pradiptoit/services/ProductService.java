package com.pradiptoit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.pradiptoit.entity.ProductEntity;
import com.pradiptoit.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public void QBExml() {
		 ProductEntity entity= new ProductEntity();
		 entity.setName("PN");
		 List<ProductEntity> products=repo.findAll(Example.of(entity));
		 
		 products.forEach(p->{
			System.out.println(p); 
		 });
	}
}
