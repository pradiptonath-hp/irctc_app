package com.pradiptosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradiptosoft.Binding.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
