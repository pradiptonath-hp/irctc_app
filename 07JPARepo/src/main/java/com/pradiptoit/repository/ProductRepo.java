package com.pradiptoit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradiptoit.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
