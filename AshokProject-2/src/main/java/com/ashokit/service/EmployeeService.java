package com.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.Repo.EmployeeRepo;
import com.ashokit.binding.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	
	//save
	public boolean saveData(Employee employee) {
		
		employee= empRepo.save(employee);
		
		return employee.getEmpId()>0;
	}
	
	
	//Retrieve
	public List<Employee> getAllEmployees() {

		List<Employee> allEmp = empRepo.findAll();
		return allEmp;
	}


	public Employee findById(Integer empId) {
		return empRepo.findById(empId).orElse(null);	
	}


	public void updateEmployee(Employee updatedEmployee) {
		// TODO Auto-generated method stub
		empRepo.save(updatedEmployee);
		
	}
	


}