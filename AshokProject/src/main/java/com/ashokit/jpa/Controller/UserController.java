package com.ashokit.jpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.jpa.binding.User;
import com.ashokit.jpa.service.UserService;

@Controller
public class UserController {

	
	@Autowired
	private UserService service;
	
	public UserController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("User Controller");
	}
	
	
	@GetMapping("/")
	public String loadFrom(Model model) {
		
		model.addAttribute("user",new User());
		return "UserFrom";
	}
	
	
	
	@PostMapping("/processUser")
	public String saveFrom(User user,Model model) {
		
		System.out.println(user);
		boolean saveUser = service.saveUser(user);
		if(saveUser){
			model.addAttribute("msg","Data save success!");
		}
		return "success";
	}
	
	@GetMapping("/viewUsers")
	public String viewUsers(Model model) {
		List<User> allUsers = service.getAllUsers();
		model.addAttribute("users",allUsers);
		return "view_users";
	}
	
	
}
