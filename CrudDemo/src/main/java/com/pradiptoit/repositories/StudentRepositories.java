package com.pradiptoit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradiptoit.entities.Student;

public interface StudentRepositories extends JpaRepository<Student, Long> {

}
