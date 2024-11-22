package com.employees.EmployeeManagement.entity;

import jakarta.persistence.Entity;

@Entity
public class Employee {
	@jakarta.persistence.Id
private int id;
private String name;
private String email;
private String number;
private String dateofJoining;
private String gender;
private String status;
private String salary;
public Employee(int id, String name, String email, String number, String dateofJoining, String gender, String status,
		String salary) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.number = number;
	this.dateofJoining = dateofJoining;
	this.gender = gender;
	this.status = status;
	this.salary = salary;
}
public Employee() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getDateofJoining() {
	return dateofJoining;
}
public void setDateofJoining(String dateofJoining) {
	this.dateofJoining = dateofJoining;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
}
