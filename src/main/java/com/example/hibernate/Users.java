package com.example.hibernate;

import java.io.Serializable;

@Entity
@Table(name="users")
public class Users implements Serializable{
	@Column(name="userId")
	private int userId;
	@Column(name="userName")
	private String userName;	
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;

	public int getUserId() {
	return userId;
	}
	public void setUserId(int userId) {
	this.userId = userId;
	}
	public int getUserName() {
	return userName;
	}
	public void setUserName(int userName) {
	this.userName = userName;
	}
	public String getEmail() {
	return email;
	}
	public void setEmail(String email) {
	this.email = email;
	}
	public String getPassword() {
	return password;
	}
	public void setPassword(String password) {
	this.password = password;
	}
	
}
