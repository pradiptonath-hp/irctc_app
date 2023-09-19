package com.pradiptoit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradiptoit.entity.UserEntity;
import com.pradiptoit.repository.UserRepos;

@Service
public class UserService {
	
	@Autowired
	private UserRepos repo;
	
	public void findByMethods(){
		/*List<UserEntity> entities=repo.findByAge(22);
		
		
		List<UserEntity> entitie=repo.findByGender("Male");
		
		entities.forEach(entity->{
			System.out.println(entity);
		});
		
		entitie.forEach(entity->{
			System.out.println(entity);
		});
		
		*/
	/*	List<String> emails=repo.getHYDEmails("HYD");
		emails.forEach(ent->{
			System.out.println(ent);
		});
		
		List<UserEntity> users=repo.getUserDetails();
		users.forEach(user->{
			System.out.println(user);
		});
		*/
		
		
	}
	public void QueryAnnotation(){
		
		repo.updateAgeById(40,1);
		System.out.println("Done update");
	}

}