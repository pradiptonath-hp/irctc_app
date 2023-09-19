package com.ashokit.jpa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathParam {
	@GetMapping("/courseInfo/{cname}/index")
		public String getCourseInfo(@PathVariable("cname")String course,Model model) {
		
			String msgTxt = course+" :New Batch starts everyweek!"; 
			model.addAttribute("msg",msgTxt);
		return "result";
	}
}
