package com.pradiptosoft.LeadService;

import java.util.List;

import com.pradiptosoft.entities.Lead;

public interface LeadService {

	 public String saveReg(Lead lead);

		public List<Lead> findAllLeads();

}
