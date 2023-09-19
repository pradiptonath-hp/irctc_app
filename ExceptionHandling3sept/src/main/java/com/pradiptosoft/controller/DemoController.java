package com.pradiptosoft.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	@GetMapping("/")
	public String demo(Model model) {
		int i=10/0;
		model.addAttribute("msg","Welcome to ASHOKIT");
		return "index.html";
	}		
	@ExceptionHandler(value=ArithmeticException.class)
	public String handleAe(ArithmeticException ex,Model model) {
		model.addAttribute("exRsn",ex.getMessage());
		model.addAttribute("date",LocalDateTime.now());
	
		return "error";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String handleAe(Exception ex,Model model) {
		
		System.out.println("ExceptionHandler method executed");
		model.addAttribute("exRsn",ex.getMessage());
		model.addAttribute("date",LocalDateTime.now());
	
		return "error";
  
	}
}

