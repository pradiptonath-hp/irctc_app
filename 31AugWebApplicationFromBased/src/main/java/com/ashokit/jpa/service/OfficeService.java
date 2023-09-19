package com.ashokit.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.jpa.binding.Office;
import com.ashokit.jpa.repository.OfficeRepository;

@Service
public class OfficeService{
	
	@Autowired
	private OfficeRepository repo;
	//insert
	public boolean saveOffice(Office office){
		office = repo.save(office);
		return office.getEmpId()>0;
 }
	//retrieve
	public List<Office> getAllOffice(){
		return repo.findAll();
	}
}