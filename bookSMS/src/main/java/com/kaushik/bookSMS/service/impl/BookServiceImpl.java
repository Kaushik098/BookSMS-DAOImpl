package com.kaushik.bookSMS.service.impl;

import java.util.List;

import com.kaushik.bookSMS.dao.BookDAO;
import com.kaushik.bookSMS.dao.impl.BookDAOImpl;
import com.kaushik.bookSMS.model.Book;
import com.kaushik.bookSMS.service.BookService;

public class BookServiceImpl implements BookService {

	public void addBook(Book book){
	    
        int bookID = book.getBookID();
        String bookName = book.getBookName();
        int bookCost = book.getBookCost();
        int bookStock = book.getBookStock();
        int authorID = book.getAuthorID();

        Book bookValues = new Book();
        
        bookValues.setBookID(bookID);
        bookValues.setBookName(bookName);
        bookValues.setBookCost(bookCost);
        bookValues.setBookStock(bookStock);
        bookValues.setAuthorID(authorID);
        
        System.out.println(bookValues);
        
        BookDAO addNewBook = new BookDAOImpl();
        addNewBook.addBook(bookValues);
	}
	
	public List<Book> getAllBooks(){
		
		BookDAO list = new BookDAOImpl();
		List<Book> l = list.getAllBooks();
		
		System.out.println(l);
		
		return l;
	}
	
}
