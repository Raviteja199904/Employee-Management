

package com.employees.EmployeeManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employees.EmployeeManagement.entity.Role;
import com.employees.EmployeeManagement.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	private RoleRepository repository;

	public List<Role> roles() {
		return repository.findAll();
	}
	
	public List<Role> saveRole(Role role) {
		repository.save(role);
		return this.roles();
	}
	
	public List<Role> deleteRole(Integer id) {
		Role role = repository.findById(id).orElse(null);
		if(role != null) {
			repository.delete(role);
		}
		return this.roles();
	}
	
	public Role retireveRole(Integer id) {
		Role role = repository.findById(id).orElse(null);
		return role;
	}
}

