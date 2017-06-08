package com.ij.service;

import java.util.List;

import com.ij.model.User;

public interface UserService {
	
	User findById(long id);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers(); 
	
	void deleteAllUsers();

    User findByUserName(User user);
}
