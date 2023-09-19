package com.pradiptoit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.pradiptoit.repository.*;
import com.pradiptoit.entities.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo repo;
	
	public void qbEx() {
		Product entity= new Product();
		entity.setName("Zen");//*****
		List<Product> products = repo.findAll(Example.of(entity));
		products.forEach(prod->{
			System.out.println(prod.getName());
		});
		
	}
	
	public void getProducts() {
		List<Product> records = repo.findAll(Sort.by("price"));
		records.forEach(rec->{
			System.out.println(rec.getName());
		});
	}
	public void pagination() {
		int pageSize=3;
		int pageNumber=0;
		PageRequest of = PageRequest.of(pageNumber, pageSize);
		Page<Product> page = repo.findAll(of);
		System.out.println(page.getTotalElements());
		List<Product> content = page.getContent();
		content.forEach(con->{
			System.out.println(con.getName());
		});
	}
	
	public void saveData() {
		Product e1= new Product(1,"Alto",2000);
		Product e2= new Product(2,"Baleno",3000);
		Product e3= new Product(3,"Ciaz",5000);
		Product e4= new Product(4,"Tigor",4000);
		Product e5= new Product(5,"Tiago",3500);
		Product e6= new Product(6,"Wagonr",2500);
		Product e7= new Product(7,"Zen",1000);
		Product e8= new Product(8,"M800",500);

		List<Product> carList = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
		repo.saveAll(carList);
		}
}