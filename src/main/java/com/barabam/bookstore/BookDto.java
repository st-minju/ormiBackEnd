package com.barabam.bookstore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
	private String title;
	private String author;
	private String isbn;
	private double price;
	private int publishedYear;
}
