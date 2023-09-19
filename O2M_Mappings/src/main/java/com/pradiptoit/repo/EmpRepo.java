package com.pradiptoit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradiptoit.entities.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
