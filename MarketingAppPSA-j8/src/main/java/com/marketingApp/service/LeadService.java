package com.marketingApp.service;

import java.util.List;

import com.marketingApp.dto.LeadDto;
import com.marketingApp.entities.Leads;

public interface LeadService {
	 public String saveReg(Leads lead);

	public List<Leads> findAllLeads();


}
