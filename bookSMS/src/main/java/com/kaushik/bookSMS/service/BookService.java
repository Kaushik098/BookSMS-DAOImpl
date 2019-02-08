package com.kaushik.bookSMS.service;

import java.util.List;

import com.kaushik.bookSMS.model.Book;

public interface BookService {

	void addBook(Book book);
	List<Book> getAllBooks();
}
