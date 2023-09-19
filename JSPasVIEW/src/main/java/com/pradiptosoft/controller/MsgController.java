package com.pradiptosoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		
		model.addAttribute("msg","welcome to ashokit");
		return "index";
	}
	
	@GetMapping("/greet")
	public String getGreet(Model model) {
		
		model.addAttribute("msg","Goood Morning !!!");
		return "index";
	}
	
	
}
