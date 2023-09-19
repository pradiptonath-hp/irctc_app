/*package com.ashokit.jpa.UserController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.jpa.binding.*;
@Controller
public class UserController {
	
	@GetMapping("/")
	public String loadFrom(Model model){
		
		model.addAttribute("user",new User());
		return "index";
		
	}
	
	@PostMapping("/submit")
	public String submit(User user,Model model) {
		
		System.out.println(user);
		model.addAttribute("msg","Data Saved succesfully");
		return "success";
		
	}
	
}
*/