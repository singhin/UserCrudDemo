package com.ij.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ij.model.User;
import com.ij.repository.UserRepository;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findById(long id) {
		
		User user = userRepository.findOne(id);
		
		return user;
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void deleteUserById(long id) {
		userRepository.delete(id);
		
	}

	@Override
	public List<User> findAllUsers() {
		List<User> users = new ArrayList<>();
		userRepository.findAll()
				.forEach(users::add);
		
		return users;
	}

	@Override
	public void deleteAllUsers() {
		userRepository.deleteAll();
		
	}
	
	@Override
	public User findByUserName(User user) {
		return userRepository.findByUserName(user.getName());
	}
}
