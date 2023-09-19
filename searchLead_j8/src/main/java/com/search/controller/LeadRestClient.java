package com.search.controller;

import com.search.dto.Leads;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class LeadRestClient {
	public Leads getLeadById(long id) {
		RestTemplate restTemplate = new RestTemplate();
		Leads lead=restTemplate.getForObject("http://localhost:8080/api/leads/"+id,Leads.class);
		return lead;
	}
}


