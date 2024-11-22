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

import com.employees.EmployeeManagement.entity.Role;
import com.employees.EmployeeManagement.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping("/employees")
	public List<Role> getRoles() {
		return roleService.roles();
	}
	
	@GetMapping("/employees/{id}")
	public Role getRole(@PathVariable Integer id) {
		var result = roleService.retireveRole(id);
		return result;
	}
	
	@PostMapping("/employees")
	public List<Role> createRole(@RequestBody Role role) {
		return roleService.saveRole(role);
	}
	
	@PutMapping("/employees")
	public List<Role> updateRole(@RequestBody Role role) {
		return roleService.saveRole(role);
	}
	
	@DeleteMapping("/employees/{id}")
	public List<Role> deleteRole(@PathVariable Integer id) {
		return roleService.deleteRole(id);
	}
}
