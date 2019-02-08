package com.kaushik.bookSMS.test;

import java.util.Iterator;
import java.util.List;

import com.kaushik.bookSMS.dao.impl.BookDAOImpl;
import com.kaushik.bookSMS.model.Book;
import com.kaushik.bookSMS.service.BookService;
import com.kaushik.bookSMS.service.impl.BookServiceImpl;

public class BookTest {

	public static void main(String args[]){
		
		Book book = new Book();
		
	//a.) add Book	
		/*book.setBookID(1002);
		book.setBookName("Prince of Persia Season 2");
		book.setBookCost(250);
		book.setBookStock(30);
		book.setAuthorID(202020);
		
		BookService addBookService = new BookServiceImpl();
		addBookService.addBook(book);*/
		
	//b.) Show all Books
		
		BookService list = new BookServiceImpl();
		List<Book> l = list.getAllBooks();
		
		System.out.println();
		
		Iterator itr = l.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
