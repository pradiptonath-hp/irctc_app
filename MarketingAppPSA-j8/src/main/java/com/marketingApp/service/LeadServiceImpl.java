package com.marketingApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingApp.dto.LeadDto;
import com.marketingApp.entities.Leads;
import com.marketingApp.repositories.LeadRepo;
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
