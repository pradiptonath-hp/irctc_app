package com.ashokit.jpa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class QueryParamCourseInfo {

	public QueryParamCourseInfo() {
		super();
		System.out.println("QP Constructor executed");
	}
	@GetMapping("/courseinfo")
	public String getInfo(@RequestParam("name")String cname,Model model) {
		System.out.println("The name of the course is"+ cname);
		String output=cname+" is the course";
		
		model.addAttribute("msg",output);
		
		return "result";
		
	}
	
	
}
