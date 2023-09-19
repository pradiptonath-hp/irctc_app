package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.DTO.LeadDto;
import com.marketingapp.entities.Lead;
import com.marketingapp.service.LeadService;

@Controller
public class leadController {
	
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/createLead")
	public String viewCreateLeadForm() {
		return "create_lead";
	}
	
	
	/*@RequestMapping("/saveReg")
	public String saveOneLead(Lead lead) {
		//System.out.println(lead.getFirstName());
		//System.out.println(lead.getLastName());
		//System.out.println(lead.getEmail());
		//System.out.println(lead.getMobile());
		
		leadService.saveReg(lead);
		return "create_lead";
	}
	*/
	
	//3 ways @ModelAttribute,Request Param , DTO object
	
	
	@RequestMapping("/saveReg")
	public String saveOneLead(@ModelAttribute Lead lead,Model model) {
	
		model.addAttribute("msg","Lead is saved");
		leadService.saveReg(lead);
		return "create_lead";
	}
/*	
	@RequestMapping("/saveReg")
	public String saveOneLead(LeadDto dto,Model model) {
	
		Lead lead= new Lead();
		lead.setFirstName(dto.getFirstName());
		lead.setLastName(dto.getLastName());
		lead.setEmail(dto.getEmail());
		lead.setMobile(dto.getMobile());
		leadService.saveReg(lead);
		model.addAttribute("msg","Lead is saved");
		return "create_lead";
	}  
	
*/	
	
/* 	@RequestMapping("/saveReg")
	public String saveOneLead(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName,@RequestParam("email") String email,@RequestParam("mobile") Long mobile,ModelMap model) {
		Lead l= new Lead();
		l.setFirstName(firstName);
		l.setLastName(lastName);
		l.setEmail(email);
		l.setMobile(mobile);
		leadService.saveReg(l);
		model.addAttribute("msg","Lead is saved");
		return "create_lead";
	}   */
	
	@RequestMapping("/list")
	public String  getAllLeads(Model model) {
		
	List<Lead> leads = leadService.findAllLeads();
	System.out.println(leads);
	model.addAttribute("leads",leads);
	return "";
	}
	
/*	@RequestMapping("/delete")
	public String deleteLeadById(@RequestParam("name") String name) {
		leadService.deleteLeadById(name);
		return "";
	}  */
}