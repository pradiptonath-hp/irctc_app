package com.pradiptoit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pradiptoit.entities.UserMasterClassEntity;
import com.pradiptoit.repository.UserMasterClassRepos;
@Service
public class UserMasterClassService {
	
	@Autowired
	private UserMasterClassRepos repo;
	
	public void test_findByMethods() {
	//List<UserMasterClassEntity> entities=repo.findByUserId(1);
	//List<UserMasterClassEntity> entity = repo.findByUserGenderAndUserAge("Male",22);

	/*entities.forEach(e->{
		System.out.println(e);
	});
	
	entity.forEach(e1->{
		System.out.println(e1);
	});
	*/
		
	List<String> entt=repo.getIndianEmails("HYD");
	entt.forEach(e1->{
		System.out.println(e1);
	});
	
	List<UserMasterClassEntity> user=repo.getAllUsers();
	user.forEach(e2->{
		System.out.println(e2);
	});
	
	
	
   }
	
	public void test_queryAnno() {
		repo.updateAgeById(1,33);
	}
	
	public void test() {
		long count =repo.count();
		System.out.println(count);
		System.out.println("Record Presence ? :" + repo.existsById(0));
		}
}