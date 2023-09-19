package com.ashokit.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.ashokit.jpa.entities.BookLand;

public interface BookLandRepo extends JpaRepository<BookLand, Integer> {
	@Transactional
	@Modifying
	@Query("update BookLand set bookName=:bookName where bookId=:bookId")
	public void updateBook(Integer bookId, String bookName );
		
		
}
