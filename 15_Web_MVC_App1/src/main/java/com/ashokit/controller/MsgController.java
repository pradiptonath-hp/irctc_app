package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	public MsgController(){
		System.out.println(" MsgController::Constructor ");
		}

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		//setting data in key value format to access in view page
		mav.addObject("msg","Welcome to Ashok It....");
		//return presentation file
		mav.setViewName("index");
		return mav;
  }
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {

		ModelAndView mav= new ModelAndView();
		mav.addObject("msg","All the best");
		mav.setViewName("index");
		return mav;
	}
}

