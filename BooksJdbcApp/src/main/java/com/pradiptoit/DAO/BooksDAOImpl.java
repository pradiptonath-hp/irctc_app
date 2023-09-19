package com.pradiptoit.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.pradiptoit.beans.Books;

public class BooksDAOImpl implements BooksDAO {

	@Override
	public int saveBook(Books book) {
		
	    String url="jdbc:mysql://localhost:3306/pythontest";
		String username="root";
		String password="Pradipto1$";
		
		try(Connection con= DriverManager.getConnection(url,username,password)){
			
			PreparedStatement pstmt = con.prepareStatement("insert into booktable values(?,?,?)");
			pstmt.setInt(1,book.getId());
			pstmt.setString(2, book.getSubject());
			pstmt.setDouble(3, book.getFees());
			
			int i=pstmt.executeUpdate();
			return i;
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return 0;
	}

}
