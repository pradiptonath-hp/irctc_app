package com.ashokit.jpa.BookController;
import com.ashokit.jpa.binding.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
	
	@GetMapping("/")
	public String loadBookForm(Model model) {
			Book book= new Book();
			model.addAttribute("book",book);
			return "bookindex";
	}
	@PostMapping("/save")
	public String saveBookData(Book book,Model model) {
		System.out.println(book);
		model.addAttribute("msg","Data saved!");
		return "success";
	}
}
