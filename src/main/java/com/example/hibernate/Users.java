package com.example.hibernate;

import java.io.Serializable;

@Entity
@Table(name="users")
public class Users implements Serializable{
	@Column(name="userId")
	private int userId;
	@Column(name="userName")
	private String useName;	
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;

	public int getUserId() {
	return userId;
	}
	public void setUserId(int userId) {
	this.postId = userName;
	}
	public int getUserName() {
	return userId;
	}
	public void setUserName(int userName) {
	this.postId = userName;
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
