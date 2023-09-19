package com.pradiptoit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product1")
public class Product {
	
	@Id
	private Integer pid;
	private String name;
	private Integer price;
	
	public Product() {
		
	}

	public Product(Integer pid, String name, Integer price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	
	
	
	
}
