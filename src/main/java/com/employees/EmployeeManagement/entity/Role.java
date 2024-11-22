package com.employees.EmployeeManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role {
	@Id
private int roleid;
private String rolename;
private int userid;
public Role(int roleid, String rolename, int userid) {
	super();
	this.roleid = roleid;
	this.rolename = rolename;
	this.userid = userid;
}
public int getRoleid() {
	return roleid;
}
public void setRoleid(int roleid) {
	this.roleid = roleid;
}
public String getRolename() {
	return rolename;
}
public void setRolename(String rolename) {
	this.rolename = rolename;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}

}
