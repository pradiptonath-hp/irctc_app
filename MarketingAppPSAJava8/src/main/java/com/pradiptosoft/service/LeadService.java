package com.pradiptosoft.service;

import java.util.List;

import com.pradiptosoft.dto.LeadDto;
import com.pradiptosoft.entities.Leads;

public interface LeadService {
	 public String saveReg(Leads lead);

	public List<Leads> findAllLeads();


}
