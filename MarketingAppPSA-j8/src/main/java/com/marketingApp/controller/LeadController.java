package com.marketingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingApp.*;
import com.marketingApp.dto.LeadDto;
import com.marketingApp.entities.Leads;
import com.marketingApp.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/create")   
	public String viewCreateleadFrom() {
		return "create_lead";//Req Dispatcher
	}
	
	@RequestMapping("/saveReg")
	public String saveOneLead(@ModelAttribute Leads lead,ModelMap model) {
		model.addAttribute("msg","Lead is saved!!");
		leadService.saveReg(lead);
		return "create_lead";
	}
	
	/*
	@RequestMapping("/saveReg")
	public String saveOneLead(@RequestParam("firstname") String firstName,@RequestParam("lastname") String lastName,@RequestParam("email") String email,@RequestParam("mobile") String mobileNo,ModelMap model)
 	{
		Leads lead = new Leads();
		lead.setFirstName("Pradipto");
		lead.setLastName("Nath");
		lead.setEmail("nathpradipto.pn@gma");
		lead.setMobile(80117003040L);
		model.addAttribute("msg","Lead is saved!");
		leadService.saveReg(lead);
		return "create_lead";
	}
	*/
	
	
	/*@RequestMapping("/saveReg")
	public String saveOneLead(LeadDto dto,Model model) {
		Leads lead = new Leads();
		lead.setFirstName(dto.getFirstName());
		lead.setLastName(dto.getLastName());
		lead.setEmail(dto.getEmail());
		lead.setMobile(dto.getMobile());
		model.addAttribute("msg","Lead is saved!!");
		leadService.saveReg(dto);
		return "create_lead";
	}*/
	
	//localhost:8080/list
	@RequestMapping("/list")
	public String getAllLeads(Model model) {
		List<Leads> leads = leadService.findAllLeads();
		model.addAttribute("leads",leads);
		System.out.println(leads);
		
		 for (Leads lead : leads) {
		        System.out.print(lead.getFirstName());
		        System.out.println(lead.getLastName());
		        System.out.println(lead.getEmail());		        
		        System.out.println(lead.getMobile());		        
		        System.out.println();
		    }
		return "";
	}
	
}