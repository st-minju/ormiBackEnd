package com.barabam.bookstore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/books") // 모든 메서드에 매핑되는 주소에는 해당 주소가 포함됨
public class BookController {

	private final BookService bookService; // 서비스를 주입받아 사용

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	// 모든 도서를 조회
	// 기본 주소를 GET 메서드를 통해 접근 시 수행됨
	@GetMapping
	public ResponseEntity<List<BookDto>> getAllBooks() {
		List<BookDto> bookDtos = bookService.getAllBooks();
		// 뷰에 OK 메세지와 함께 반환
		return ResponseEntity.ok(bookDtos);
	}

	// 아이디로 특정 도서 조회
	// 검색하고자 하는 아이디를 포함한 주소를 GET 메서드를 통해 접근 시 수행됨
	@GetMapping("/{id}")
	public ResponseEntity<BookDto> getBookById(@PathVariable("id") Long id) {
		BookDto bookDto = bookService.getBookById(id);
		// 뷰에 OK 메세지와 함께 반환
		return ResponseEntity.ok(bookDto);
	}

	// 새 도서 등록
	// 기본 주소를 POST 메서드를 통해 접근 시 수행됨
	@PostMapping
	public ResponseEntity<BookDto> createBook(@RequestBody BookDto bookDto) {
		BookDto createdBookDto = bookService.createBook(bookDto);
		// 뷰에 201 상태 메세지와 함께 반환
		return ResponseEntity.status(201).body(createdBookDto);
	}

	// 도서 정보 수정
	// 검색하고자 하는 아이디를 포함한 주소를 PUT 메서드를 통해 접근 시 수행됨
	@PutMapping("/{id}")
	public ResponseEntity<BookDto> updateBook(@PathVariable("id") Long id, @RequestBody BookDto updateBookDto) {
		BookDto bookDto = bookService.updateBook(id, updateBookDto);
		// 뷰에 OK 메세지와 함께 반환
		return ResponseEntity.ok(bookDto);
	}

	// 도서 삭제
	// 검색하고자 하는 아이디를 포함한 주소를 DELETE 메서드를 통해 접근 시 수행됨
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteBook(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
		// 뷰에 메세지와 함께 반환
		return ResponseEntity.noContent().build();
	}

}
