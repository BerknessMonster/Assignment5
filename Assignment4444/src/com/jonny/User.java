package com.jonny;

public class User {
private String username;
private String password;
private String name;
private String role;

@Override
public String toString() {
	return "User [username=" + username + ", password=" + password + ", name=" + name + ", role=" + role + "]";
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
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
}