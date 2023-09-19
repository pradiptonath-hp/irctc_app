package com.marketingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingApp.entities.Leads;

public interface LeadRepository extends JpaRepository<Leads, Long> {

}
