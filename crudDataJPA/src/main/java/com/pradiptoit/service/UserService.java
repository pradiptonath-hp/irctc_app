package com.pradiptoit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradiptoit.entity.UserMasterEntity;
import com.pradiptoit.repos.UserMasterRepo;

@Service
public class UserService {
	@Autowired
	private UserMasterRepo userMaster;
	
	
	public void saveUser() {
	UserMasterEntity userEntity =new UserMasterEntity();
	userEntity.setId(2);
	userEntity.setName("Pradipto Nath");
	userEntity.setEmail("nathpradipto.pn@gmail.com");
	userEntity.setGender("Male");
	userEntity.setCity("Ramkrishna Nagar");
	userEntity.setAge(21);

	userMaster.save(userEntity);
	System.out.println("Data Saved...");
	}
}
