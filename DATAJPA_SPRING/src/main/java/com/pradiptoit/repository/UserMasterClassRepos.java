package com.pradiptoit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.pradiptoit.entities.UserMasterClassEntity;
import java.util.List;


public interface UserMasterClassRepos extends JpaRepository<UserMasterClassEntity, Integer> {
	
	//public List<UserMasterClassEntity> findByUserId(Integer userId);
	
	//public List<UserMasterClassEntity> findByUserGenderAndUserAge(String userGender,int userAge);
	
	@Query("select userEmail from UserMasterClassEntity where userCity=:userCity")
	public List<String> getIndianEmails(String userCity);
	
	//@Query("from UserMasterClassEntity")
	@Query(value="select * from user_master11",nativeQuery= true)
	public List<UserMasterClassEntity> getAllUsers();
	
	@Transactional
	@Modifying
	@Query("update UserMasterClassEntity set userAge= :userAge where userId=:userId")
	public void updateAgeById(int userId,int userAge);
}
