package com.pradiptoit.service;
import com.pradiptoit.entities.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradiptoit.repo.AddressRepo;
import com.pradiptoit.repo.EmpRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmpRepo empRepo;
	@Autowired
	private AddressRepo addrRepo;
	
	public void getAddrData() {
		Optional<Address> findById = addrRepo.findById(1);
	}
	public void saveData() {
		Employee emp =new Employee();
		emp.setEmpName("John");
		emp.setSalary(1000.00);
		
		
		Address a1= new Address();
		a1.setCity("Hyd");
		a1.setState("TG");
		a1.setType("Present");
		a1.setEmp(emp);
		
		Address a2= new Address();
		a2.setCity("SCl");
		a2.setState("AS");
		a2.setType("Permanent");
		a2.setEmp(emp);
		
		List<Address> addrList=Arrays.asList(a1,a2);
		emp.setAddr(addrList);
		
		empRepo.save(emp);
		
	}
	
}
