package com.barabam.bookstore;

import java.util.ArrayList;
import java.util.List;

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
public class BookStoreController {

	private List<Book> books = new ArrayList<>(); // Book 객체들을 저장할 컬렉션
	private Long bookId = 1L; // 새 도서 등록시 자동으로 증가하는 아이디 값

	// 모든 도서를 조회
	// 기본 주소를 GET 메서드를 통해 접근 시 수행됨
	@GetMapping
	public List<Book> readAllBooks() {
		return books;
	}

	// 아이디로 특정 도서 조회
	// 검색하고자 하는 아이디를 포함한 주소를 GET 메서드를 통해 접근 시 수행됨
	@GetMapping("/{id}")
	public ResponseEntity<BookDto> readBookById(@PathVariable("id") Long id) {
		Book book = findBookById(id); // 해당 아이디의 객체가 존재하는지 검색

		// 일치하는 엔티티를 DTO로 변환하여 뷰에 OK 메세지와 함께 반환
		BookDto bookDto = convertToBookDto(book);
		return ResponseEntity.ok(bookDto);
	}

	// 새 도서 등록
	// 기본 주소를 POST 메서드를 통해 접근 시 수행됨
	@PostMapping
	public ResponseEntity<BookDto> createBook(@RequestBody BookDto bookDto) {
		// DTO형태로 받아온 데이터를 엔티티로 변환하여 저장
		Book book = convertToBookEntity(bookDto);
		book.setId(bookId++);
		books.add(book);

		// 저장한 엔티티를 다시 DTO로 변환하여 뷰에 201 상태 메세지와 함께 반환
		BookDto createdBookDto = convertToBookDto(book);
		return ResponseEntity.status(201).body(createdBookDto);
	}

	// 도서 정보 수정
	// 검색하고자 하는 아이디를 포함한 주소를 PUT 메서드를 통해 접근 시 수행됨
	@PutMapping("/{id}")
	public ResponseEntity<BookDto> updateBook(@PathVariable("id") Long id, @RequestBody Book updateBook) {
		Book book = findBookById(id); // 해당 아이디의 객체가 존재하는지 검색

		// 일치하는 객체 존재 시, 해당 객체의 값을 수정사항으로 덮어쓰기
		book.setTitle(updateBook.getTitle());
		book.setAuthor(updateBook.getAuthor());
		book.setPrice(updateBook.getPrice());
		book.setIsbn(updateBook.getIsbn());
		book.setPublishedYear(updateBook.getPublishedYear());

		// 덮어쓰기 된 엔티티를 DTO로 변환하여 뷰에 OK 메세지와 함께 반환
		BookDto bookDto = convertToBookDto(book);
		return ResponseEntity.ok(bookDto);
	}

	// 도서 삭제
	// 검색하고자 하는 아이디를 포함한 주소를 DELETE 메서드를 통해 접근 시 수행됨
	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable("id") Long id) {
		Book book = findBookById(id); // 해당 아이디의 객체가 존재하는지 검색
		books.remove(book); // 해당하는 아이디의 객체가 있으면 객체 삭제
	}

	// 찾고자하는 아이디의 객체가 존재하는지 검색해주는 메서드
	// 일치하는 아이디의 객체가 존재하지 않으면 에러메세지가 출력됨
	private Book findBookById(Long id) {
		return books.stream()
			.filter(b -> b.getId() == id)
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("해당하는 아이디의 책이 존재하지 않습니다."));

	}

	// 엔티티를 DTO 객체로 바꿔주는 메서드
	private BookDto convertToBookDto(Book book) {
		BookDto bookDto = new BookDto();
		bookDto.setTitle(book.getTitle());
		bookDto.setAuthor(book.getAuthor());
		bookDto.setPrice(book.getPrice());
		bookDto.setIsbn(book.getIsbn());
		bookDto.setPublishedYear(book.getPublishedYear());

		return bookDto;
	}

	// DTO 객체를 엔티티로 바꿔주는 메서드
	private Book convertToBookEntity(BookDto bookDto) {
		Book book = new Book();
		book.setTitle(bookDto.getTitle());
		book.setAuthor(bookDto.getAuthor());
		book.setPrice(bookDto.getPrice());
		book.setIsbn(bookDto.getIsbn());
		book.setPublishedYear(bookDto.getPublishedYear());

		return book;
	}
}
