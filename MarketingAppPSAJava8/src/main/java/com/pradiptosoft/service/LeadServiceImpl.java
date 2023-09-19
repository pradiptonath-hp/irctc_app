package com.pradiptosoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pradiptosoft.dto.LeadDto;
import com.pradiptosoft.entities.Leads;
import com.pradiptosoft.repository.LeadRepo;
@Service
public class LeadServiceImpl implements LeadService{
    
	@Autowired
	private LeadRepo leadRepo;
	
	

	@Override
	public String saveReg(Leads lead) {
		// TODO Auto-generated method stub
		leadRepo.save(lead);
		return "";
	}

	
	@Override
	public List<Leads> findAllLeads(){
		List<Leads> leads = leadRepo.findAll();
		return leads;
		
	}

}
