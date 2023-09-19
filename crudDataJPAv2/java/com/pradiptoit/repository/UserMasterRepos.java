package com.pradiptoit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.pradiptoit.entity.UserMasterEntity;



@Repository
public interface UserMasterRepos extends CrudRepository<UserMasterEntity, Integer> {
	//select * from user_master where user_city="HYD"
	public List<UserMasterEntity> findByUser_city(String user_city);

}
