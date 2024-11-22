package com.employees.EmployeeManagement.repository;
import com.employees.EmployeeManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}

