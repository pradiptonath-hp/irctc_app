package com.pradiptoit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradiptoit.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {

}
