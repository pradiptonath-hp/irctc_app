package com.marketingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LeadController {
	
	
		@RequestMapping("/create")
		public String  viewCreateLeadForm() {
			return "create_lead";
			
		}
}
