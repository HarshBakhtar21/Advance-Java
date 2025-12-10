package com.demo.beans;

public class MyUser {
 private String uname;
 private String passwd;
 private String role;
public MyUser() {
	super();

}
public MyUser(String uname, String password, String role) {
	super();
	this.uname = uname;
	this.passwd = password;
	this.role = role;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPassword() {
	return passwd;
}
public void setPassword(String password) {
	this.passwd = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "MyUser [uname=" + uname + ", password=" + passwd + ", role=" + role + "]";
}
 
}
