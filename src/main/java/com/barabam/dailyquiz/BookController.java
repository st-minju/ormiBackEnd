package com.barabam.dailyquiz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {
	private List<Book> books = new ArrayList<>();
	private long bookId = 1L;

	@GetMapping
	public String Book(Model model){
		model.addAttribute("books", books);
		return "books";
	}

	@GetMapping("/new")
	public String newBook(Model model) {
		model.addAttribute("book", new Book());
		return "addBook";
	}

	@PostMapping
	public String addBook(@ModelAttribute Book book) {
		book.setId(bookId++);
		books.add(book);
		return "redirect:/books";
	}
}
