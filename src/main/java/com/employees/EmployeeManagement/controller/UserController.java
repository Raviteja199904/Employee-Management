

package com.employees.EmployeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employees.EmployeeManagement.entity.User;
import com.employees.EmployeeManagement.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/employees")
	public List<User> getUsers() {
		return userService.users();
	}
	
	@GetMapping("/employees/{id}")
	public User getUser(@PathVariable Integer id) {
		var result = userService.retireveUser(id);
		return result;
	}
	
	@PostMapping("/employees")
	public List<User> createUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@PutMapping("/employees")
	public List<User> updateRole(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@DeleteMapping("/employees/{id}")
	public List<User> deleteUser(@PathVariable Integer id) {
		List<User> id1= UserService.deleteUser(id);
		return id1;
	}
}
