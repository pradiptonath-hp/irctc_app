package com.pradiptoit.DAO;

import org.springframework.stereotype.Repository;

import com.pradiptoit.beans.Books;

@Repository
public interface BooksDAO {
	public int saveBook(Books book);
}
