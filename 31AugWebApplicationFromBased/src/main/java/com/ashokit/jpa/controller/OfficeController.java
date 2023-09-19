package com.ashokit.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.jpa.binding.*;
import com.ashokit.jpa.repository.OfficeRepository;
import com.ashokit.jpa.service.OfficeService;

@Controller
public class OfficeController {
	
	@Autowired
	private OfficeService service;;

	public OfficeController() {
		super();
		System.out.println("Office Controller executed!!");
	}
	
	@GetMapping("/load")
	public String loadForm(Model model) {
		
		model.addAttribute("employee",new Office());
		return "officeForm";		
	}
	
	@PostMapping("/saveEmployee")
	public String save(Office office,Model model)
	{
		//System.out.println(office);
		boolean saveOffice = service.saveOffice(office);
		
		if(saveOffice) {
		model.addAttribute("msg","Data saved successfully");
		}
		return "officeForm";		

		
	}

}
