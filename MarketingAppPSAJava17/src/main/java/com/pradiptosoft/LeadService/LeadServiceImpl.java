package com.pradiptosoft.LeadService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradiptosoft.entities.Lead;
import com.pradiptosoft.LeadRepo.leadRepo;
import com.pradiptosoft.entities.Lead;
@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private leadRepo repo;
	
	

	@Override
	public String saveReg(Lead lead) {
		// TODO Auto-generated method stub
		repo.save(lead);
		return "";
	}

	
	@Override
	public List<Lead> findAllLeads(){
		List<Lead> leads = repo.findAll();
		return leads;
		
	}
}
