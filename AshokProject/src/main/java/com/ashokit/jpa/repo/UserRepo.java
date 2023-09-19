package com.ashokit.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.jpa.binding.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}