package com.ashokit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.binding.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
