package com.ashokit.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.jpa.binding.User;
import com.ashokit.jpa.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	//Insert Data
	public boolean saveUser(User user) {
		 user = userRepo.save(user);
		 return user.getUserId()>0;
	}
	
	//Retrieve Data
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
		
	}
	
}
