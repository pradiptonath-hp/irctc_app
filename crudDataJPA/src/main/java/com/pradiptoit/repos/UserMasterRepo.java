package com.pradiptoit.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pradiptoit.entity.UserMasterEntity;

@Repository
public interface UserMasterRepo extends CrudRepository<UserMasterEntity, Integer> {

}
