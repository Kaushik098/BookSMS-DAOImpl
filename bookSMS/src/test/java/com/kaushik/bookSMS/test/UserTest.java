package com.kaushik.bookSMS.test;

import java.time.LocalDate;

import com.kaushik.bookSMS.model.User;
import com.kaushik.bookSMS.service.UserService;
import com.kaushik.bookSMS.service.impl.UserServiceImpl;
import com.kaushik.bookSMS.validate.RegisterValidate;

public class UserTest {

	public static void main(String args[]){
		
		User values = new User();
		
		/*values.setUsername("Anusha");
		values.setPassword("AnushaDev001");
		LocalDate dt = LocalDate.parse("2000-10-20");
		values.setDob(dt);
		values.setGender('F');
		values.setAddress("No:10 Hanuman Nagar, 2nd Street, Tiruvallur");
		values.setSecurityPin(3010);
		
		RegisterValidate validate = new RegisterValidate();
		String rv = validate.validate(values);
		
		if(rv.equals("Success")){
		UserService regService = new UserServiceImpl();
		regService.register(values);
		}
		else{
			System.out.println("Please enter the details properly");
		}*/
		
		//login
		
		values.setUsername("Dashwood");
		values.setPassword("Dashwood001");
	
		UserService logService = new UserServiceImpl();
		User value = logService.login(values);
		
		System.out.println(value);
	}
}
