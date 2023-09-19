package com.marketingApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingApp.entities.Leads;

public interface LeadRepo extends JpaRepository<Leads, Long> {

}
