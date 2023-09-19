package com.marketingapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp.entities.Lead;
import com.marketingapp.repository.LeadRepo;

@Service
public class LeadServiceImpl implements LeadService {

	
	@Autowired
	private LeadRepo repo;

	@Override
	public void saveReg(Lead lead) {
		// TODO Auto-generated method stub
		repo.save(lead);
	}

	@Override
	public List<Lead> findAllLeads() {
		// TODO Auto-generated method stub
		List<Lead> leads = repo.findAll();
		return leads;
	}
/*
	@Override
	public void deleteLeadById(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

*/

	

}
