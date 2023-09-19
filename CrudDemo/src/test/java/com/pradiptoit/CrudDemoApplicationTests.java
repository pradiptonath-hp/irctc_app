package com.pradiptoit;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import com.pradiptoit.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pradiptoit.repositories.StudentRepositories;

@SpringBootTest
class CrudDemoApplicationTests {
	
	@Autowired
	private StudentRepositories repo;
	
	@Test
	void contextLoads() {
		System.out.println(repo);
	}
	@Test
	void saveData() {
		Student entity = new Student();
		entity.setName("Anisha");
		entity.setFee(30000);
		entity.setCourse("DevOps");
		repo.save(entity);
		}
	
	@Test
	void deleteData() {
		repo.deleteById(1L);
	}
	@Test
	void findData() {
		Optional<Student> id = repo.findById(3L);
		System.out.println(id.get().getName());
	}
	
	
}