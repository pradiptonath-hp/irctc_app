package com.pradiptoit.SERVICE;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import com.pradiptoit.beans.Books;


import org.springframework.beans.factory.annotation.Autowired;

import com.pradiptoit.DAO.BooksDAO;

public class SERVICEImpl implements SERVICE {
	
	@Autowired
	BooksDAO booksdao;
	
	@Override
	public void processBook() {
		String filepath="D:/Downloads/Books.txt";
		try{
			Stream<String> lines= Files.lines(Paths.get(filepath));
			
			lines.forEach(line->{
				String[] values=line.split(",");
				Books b= new Books();
				b.setId(Integer.parseInt(values[0]));
				b.setSubject(values[1]);
				b.setFees(Double.parseDouble(values[2]));
				int cnt=booksdao.saveBook(b);
				if(cnt > 0){
                    System.out.println("Record Inserted..");
                }
		}
			
	);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
