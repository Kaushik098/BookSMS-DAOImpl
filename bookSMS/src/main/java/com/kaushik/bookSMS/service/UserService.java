package com.kaushik.bookSMS.service;

import com.kaushik.bookSMS.model.User;

public interface UserService {

	void register(User user);
	User login(User user);
	
}
