package com.employees.EmployeeManagement.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class User {
	@Id
	private int userid;
	private String username;
	private String password;
	public User(int userid, String username, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
