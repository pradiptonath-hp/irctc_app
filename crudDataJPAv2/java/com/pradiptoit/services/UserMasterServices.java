package com.pradiptoit.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradiptoit.entity.UserMasterEntity;
import com.pradiptoit.repository.UserMasterRepos;
@Service
public class UserMasterServices {

	@Autowired
	private UserMasterRepos userMaster;
	
	/*public void saveDetails() {
		UserMasterEntity userEntity= new UserMasterEntity();
		userEntity.setUser_id(1);
		userEntity.setUser_name("Pradipto");
		userEntity.setUser_gender("Male");
		userEntity.setUser_email("nathpradipto.pn@gmail.com");
		userEntity.setUser_city("HYD");
		userEntity.setUser_age(23);
		//userMaster.save(userEntity);
		System.out.println("Done Saving");
	}
	public void saveDetail() {
		UserMasterEntity userEntity1= new UserMasterEntity();
		UserMasterEntity userEntity2= new UserMasterEntity();

		userEntity1.setUser_id(3);
		userEntity1.setUser_name("Prdipto");
		userEntity1.setUser_gender("FeMale");
		userEntity1.setUser_email("nathpradipto.pn@gmail.com");
		userEntity1.setUser_city("HYD1");
		userEntity1.setUser_age(22);
		//userMaster.save(userEntity1);
		
		userEntity2.setUser_id(4);
		userEntity2.setUser_name("Prdipto");
		userEntity2.setUser_gender("FeMale");
		userEntity2.setUser_email("nathpradipto.pn@gmail.com");
		userEntity2.setUser_city("HYD1");
		userEntity2.setUser_age(22);
		//userMaster.saveAll(Arrays.asList(userEntity1,userEntity2));
		System.out.println("Done Saving");
	}
	public void findBYID() {
		UserMasterEntity entity = new UserMasterEntity();
		//Optional<UserMasterEntity> findById = userMaster.findById(3);
		//if(findById.isPresent()) {
		//	System.out.println("Id found");}
		//else {
		//	System.out.println("Not found");}
		//Iterable<UserMasterEntity> findAllById = userMaster.findAllById(Arrays.asList(1,3,4));
		findAllById.forEach(user->{
			System.out.println(user);
		});
		
	
	}*/
	public void findbyvar() {
	List <UserMasterEntity> entities=userMaster.findByUser_city("HYD");
	entities.forEach(entity->{
		System.out.println(entity);
	});
	}
}
