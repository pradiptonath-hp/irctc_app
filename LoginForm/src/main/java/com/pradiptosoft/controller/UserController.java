package com.pradiptosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.pradiptosoft.Binding.User;
import com.pradiptosoft.repository.UserRepository;

@Controller
public class UserController {
	
	
	@Autowired
	private UserRepository repo;

	public UserController() {
		super();
	}
	
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	
	@GetMapping("/register")
	public String loadRegistrationForm(Model model) {
		model.addAttribute("user",new User());
		return "registration";
	}
	
	@PostMapping("/register")
	public String saveRegistrationForm(User user) {
		User save = repo.save(user);
		return "redirect:/login";
	}
}
