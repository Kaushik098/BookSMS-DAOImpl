package com.kaushik.bookSMS.service.impl;

import java.time.LocalDate;

import org.apache.log4j.Logger;

import com.kaushik.bookSMS.dao.UserDAO;
import com.kaushik.bookSMS.dao.impl.UserDAOImpl;
import com.kaushik.bookSMS.model.User;
import com.kaushik.bookSMS.service.UserService;

public class UserServiceImpl implements UserService{
    
	static Logger userLog = Logger.getLogger(UserServiceImpl.class.getName());
	 
	public void register (User user){
		 	
		 userLog.info("Register method invoked");
		
		 String userName = user.getUsername();
		 String pwd = user.getPassword();
		 LocalDate dob = user.getDob();
		 char gender = user.getGender();
		 String address= user.getAddress();
		 
		 User passValues = new User();
		 
		 passValues.setUsername(userName);
		 passValues.setPassword(pwd);
		 passValues.setDob(dob);
		 passValues.setGender(gender);
         passValues.setAddress(address);
                  
         UserDAO userDAO = new UserDAOImpl();
         userDAO.register(passValues);
		 
	} //registerService
	
	public User login(User user){
		
		userLog.info("Login method invoked");
		
		String username = user.getUsername();
		String password = user.getPassword();

		UserDAO passValues = new UserDAOImpl();
	    User b = passValues.login(username, password); 
		
		return b;
	}
	
}
