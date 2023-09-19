package com.pradiptosoft.LeadRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradiptosoft.entities.Lead;



public interface leadRepo extends JpaRepository<Lead, Long>  {

}
