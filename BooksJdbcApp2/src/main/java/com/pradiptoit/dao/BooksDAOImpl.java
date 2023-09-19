package com.pradiptoit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.pradiptoit.beans.Books;

public class BooksDAOImpl implements BooksDAO {
	
	
	
	@Override
	public int save(Books book) {
	    final String db_url="jdbc:mysql://localhost:3306/pythontest";
	    final String db_user="root";
	    final String db_pwd="Pradipto1$";
	    
	    try(Connection con = DriverManager.getConnection(db_url,db_user,db_pwd)){
	    	PreparedStatement  pstmt= con.prepareStatement("INSERT INTO dBnAmE VALUES(?,?,?)");
	    	pstmt.setInt(1, book.getBookId());
	    	pstmt.setString(2, book.getBookName());
	    	pstmt.setDouble(3, book.getBookPrice());
	    	
	    	int i =pstmt.executeUpdate();
	    	
	    	if(i>0) {
	    		return i;
	    	}
	    	
	    }catch(Exception ex) {
	    	ex.printStackTrace();
	    }
		return 0;
	}

}
