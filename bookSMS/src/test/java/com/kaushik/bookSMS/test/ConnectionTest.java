package com.kaushik.bookSMS.test;

import java.sql.Connection;

import com.kaushik.bookSMS.util.ConnectionUtil;

public class ConnectionTest {
 
	public static void main(String args[]) throws Exception{
		  
		  Connection conn = null;
		  conn = ConnectionUtil.getConnection();
		  System.out.println("DataBase Connected");
	  }
	
}
