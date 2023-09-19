package com.pradiptoit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pradiptoit.entity.UserEntity;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepos extends CrudRepository<UserEntity,Integer> {
	public List<UserEntity> findByAge(int age);
	public List<UserEntity> findByGender(String gender);
	
	@Query("select email from UserEntity where city = :city")
	public List<String>  getHYDEmails(String city);
	
	@Query("from UserEntity")
	public List<UserEntity> getUserDetails();
	
	@Transactional
	@Modifying
	@Query("update UserEntity set age =:age where id=:id")
	public void updateAgeById(int age,int id);
}
