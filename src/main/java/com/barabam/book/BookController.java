package com.barabam.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {
	private List<Book> books = new ArrayList<>();
	private long bookId = 1L;

	@GetMapping
	public String listBooks(Model model){
		model.addAttribute("books", books);
		return "books";
	}

	@GetMapping("/new")
	public String showAddBookForm(Model model) {
		model.addAttribute("book", new Book());
		return "addBook";
	}

	@PostMapping
	public String addBook(@ModelAttribute Book book) {
		book.setId(bookId++);
		books.add(book);
		return "redirect:/books";
	}

	@GetMapping("/editBook/{id}")
	public String showEditForm(@PathVariable("id") long id, Model model) {
		Book book = findBookById(id);
		model.addAttribute("book", book);
		return "editBook";
	}

	@PostMapping("/editBook/{id}")
	public String editBook(@PathVariable("id") long id, @ModelAttribute Book updateBook) {
		Book book = findBookById(id);
    	updateBook(book, updateBook);
		return "redirect:/books";
	}

	@PostMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id") long id) {
		Book book = findBookById(id);
		books.remove(book);
		return "redirect:/books";
	}

	private Book findBookById(long id) {
		Book book = books.stream()
			.filter(b -> b.getId() == id)
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("해당하는 아이디의 책이 없습니다."));
		return book;
	}

	private void updateBook(Book book, Book updateBook) {
		book.setTitle(updateBook.getTitle());
		book.setAuthor(updateBook.getAuthor());
		book.setPublicationYear(updateBook.getPublicationYear());

	}
}
