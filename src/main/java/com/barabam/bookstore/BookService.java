package com.barabam.bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookService {
	private List<Book> books = new ArrayList<>(); // Book 객체들을 저장할 컬렉션
	private Long bookId = 1L; // 새 도서 등록시 자동으로 증가하는 아이디 값

	// 모든 도서를 조회
	public List<BookDto> getAllBooks() {
		// 모든 객체를 DTO 객체로 바꾸어 반환
		return books.stream()
			.map(this::convertToBookDto)
			.collect(Collectors.toList());
	}

	// 아이디로 특정 도서 조회
	public BookDto getBookById(Long id) {
		return findBookDtoById(id); // 아이디 검색해서 받아온 DTO 객체 반환
	}

	// 새 도서 등록
	public BookDto createBook(BookDto bookDto) {
		// DTO형태로 받아온 데이터를 엔티티로 변환하여 저장
		Book book = convertToBookEntity(bookDto);
		book.setId(bookId++);
		books.add(book);

		// 저장한 엔티티를 다시 DTO로 변환하여 반환
		return convertToBookDto(book);
	}

	// 도서 정보 수정
	public BookDto updateBook(Long id, BookDto updateBookDto) {
		// 해당 아이디의 객체가 존재하는지 검색
		Book book = findBookById(id);

		// 일치하는 객체 존재 시, 해당 객체의 값을 수정사항으로 덮어쓰기
		book.setTitle(updateBookDto.getTitle());
		book.setAuthor(updateBookDto.getAuthor());
		book.setPrice(updateBookDto.getPrice());
		book.setIsbn(updateBookDto.getIsbn());
		book.setPublishedYear(updateBookDto.getPublishedYear());

		// 덮어쓰기 된 엔티티를 DTO로 변환하여 반환
		return convertToBookDto(book);
	}

	// 도서 삭제
	public void deleteBook(Long id) {
		Book book = findBookById(id); // 해당 아이디의 객체가 존재하는지 검색
		books.remove(book); // 해당하는 아이디의 객체가 있으면 객체 삭제
		log.info("룰루 삭제 성공~~");
	}

	// 찾고자하는 아이디의 객체가 존재하는지 검색해주는 메서드
	private Book findBookById(Long id) {
		log.info("룰루랄라 아이디 찾는 중~~~~"); // 확인 로그 찍기
		return books.stream()
			.filter(b -> b.getId().equals(id))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("해당하는 아이디의 책이 존재하지 않습니다."));
	}

	// 찾고자하는 아이디의 DTO 객체가 존재하는지 검색해주는 메서드
	private BookDto findBookDtoById(Long id) {
		log.info("룰루랄라 아이디 찾는 중~~~~"); // 확인 로그 찍기
		return books.stream()
			.filter(b -> b.getId().equals(id))
			.map(this::convertToBookDto)
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
