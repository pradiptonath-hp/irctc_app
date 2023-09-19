package com.pradiptoit.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;

import com.pradiptoit.beans.Books;
import com.pradiptoit.dao.BooksDAO;

public class bookServiceImpl implements bookService {
	@Autowired
	BooksDAO bookdao;
	
	@Override
	public void processBook() {
		String filepath="D:/Downloads/Books.txt";
		try {
			Stream<String> lines= Files.lines(Paths.get(filepath));
			lines.forEach(line->{
				String[] values=line.split(",");
				Books book= new Books();
				book.setBookId(Integer.parseInt(values[0]));
				book.setBookName(values[1]);
				book.setBookPrice(Double.parseDouble(values[2]));
				int cnt=bookdao.save(book);
				if(cnt>1) {
					System.out.println("Record saved succesfully");
				}
				
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
