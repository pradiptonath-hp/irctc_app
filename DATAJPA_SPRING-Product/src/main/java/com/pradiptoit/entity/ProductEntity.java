package com.pradiptoit.entity;

//import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Sort;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="ProductEntity")
public class ProductEntity {
	@Id
	private Integer pid;
	private String name;
	private Double price;
	
	public ProductEntity(Integer pid, String name, Double price) {
	//super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	
	public ProductEntity() {
	
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "ProductEntity [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}
}
