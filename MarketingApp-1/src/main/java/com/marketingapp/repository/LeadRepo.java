package com.marketingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingapp.entities.Lead;

public interface LeadRepo extends JpaRepository<Lead, Long> {

}
