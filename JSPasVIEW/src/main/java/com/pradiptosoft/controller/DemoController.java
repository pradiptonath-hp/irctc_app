package com.pradiptosoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

	
	@GetMapping("/test1")
	public String test1(@RequestParam("id")Integer id,Model model) {
		model.addAttribute("msg","This is test1()  method");
		System.out.println(id);
		return "index";	
	}
	
	@GetMapping("/test2")
	public String test2(Model model) {
		model.addAttribute("msg","This is test2() method");
		return "redirect:/test1?id=101"; //redirect to another method and passing value from one controller to another
	
	}
}
