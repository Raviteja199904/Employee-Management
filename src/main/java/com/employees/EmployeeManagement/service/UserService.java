package com.employees.EmployeeManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employees.EmployeeManagement.entity.User;
import com.employees.EmployeeManagement.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public List<User> Users() {
		return repository.findAll();
	}
	
	public List<User> saveUser(User user) {
		repository.save(user);
		return this.Users();
	}
	
	public List<User> deleteUser(Integer id) {
		User use = repository.findById(id).orElse(null);
		if(use != null) {
			repository.delete(use);
		}
		return this.Users();
	}
	
	public User retireveUser(Integer id) {
		User use = repository.findById(id).orElse(null);
		return use;
	}
}
