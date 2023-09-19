package com.pradiptoit.dao;

import org.springframework.stereotype.Repository;

import com.pradiptoit.beans.Books;


@Repository
public interface BooksDAO {
	public int save(Books book);
}
