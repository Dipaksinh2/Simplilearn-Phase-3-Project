package com.sporty.shoes.store.service;


import java.util.List;

import com.sporty.shoes.store.domain.User;

public interface UserService {
	
	User findById(Long id);
	
	User findByUsername(String username);
		
	User findByEmail(String email);
		
	void save(User user);
	
	User createUser(String username, String email,  String password, List<String> roles);
	
	List<User> getAllUsers();

}
