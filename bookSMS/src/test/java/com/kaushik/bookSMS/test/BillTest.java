package com.kaushik.bookSMS.test;

import java.util.List;

import com.kaushik.bookSMS.dao.BillDAO;
import com.kaushik.bookSMS.dao.impl.BillDAOImpl;
import com.kaushik.bookSMS.model.Book;

public class BillTest {

public static void main(String args[]){
	    
		BillDAO p = new BillDAOImpl();
		List<Book> u = p.genrateBill(3, 1001);
		
		System.out.println(u);
		
		
	}
}
