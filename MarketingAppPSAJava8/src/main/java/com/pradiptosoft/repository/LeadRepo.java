package com.pradiptosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradiptosoft.entities.Leads;
import com.pradiptosoft.entities.*;
public interface LeadRepo extends JpaRepository<Leads, Long> {

}
