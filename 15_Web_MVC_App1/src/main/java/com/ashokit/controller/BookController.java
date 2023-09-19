package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

	public BookController() {
		// TODO Auto-generated constructor stub
		System.out.println("Book Controller constructor");
	}
	@GetMapping("bookDetails")
	public ModelAndView getBookDetails() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("bookname","Devops");
		mav.addObject("price","200000");
		mav.addObject("author","Ashok");
		
		mav.setViewName("bookDetails");
		return mav;
	}
}
