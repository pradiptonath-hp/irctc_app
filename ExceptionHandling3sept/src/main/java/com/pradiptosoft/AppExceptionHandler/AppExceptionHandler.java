package com.pradiptosoft.AppExceptionHandler;

import java.time.LocalDateTime;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//This is the way to create common Global Exception handler

//Class within Controller Advice class is used for exception handling
@ControllerAdvice 
public class AppExceptionHandler {

	
	
	@ExceptionHandler(value=NullPointerException.class) //it is used to handle the exception when particular exception occurs
	public String handleNpe(NullPointerException ex,Model model) {
		
		System.out.println("Null Pointer ExceptionHandler method executed");
		model.addAttribute("exRsn",ex.getMessage());
		model.addAttribute("date",LocalDateTime.now());
		return "error";

	}

@ExceptionHandler(value=Exception.class)
public String handleEx(Exception ex,Model model) {
	
	System.out.println("ExceptionHandler method executed");
	model.addAttribute("exRsn",ex.getMessage());
	model.addAttribute("date",LocalDateTime.now());
	return "error";
	
	}
}