package com.san.webServiceCourse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.san.webServiceCourse.entities.User;
import com.san.webServiceCourse.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> optional = repository.findById(id);
		return optional.get();
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
	public void deleteUserById(Long id) {
		repository.deleteById(id);
	}
}
