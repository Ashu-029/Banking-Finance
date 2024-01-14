package com.admin.service;

import java.util.List;

import com.admin.model.User;



public interface AdminService {

	
	User addUser(User user);
	
	User getUserById(int id);
	
	List<User> getAllUser();
	 
	void  deleteUserById(int id);
	
}
