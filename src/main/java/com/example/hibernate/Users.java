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

	public int getuserId() {
	return userId;
	}
	public void setuserNameId(int userId) {
	this.postId = userName;
	}
	public String getemail() {
	return email;
	}
	public void setemail(String title) {
	this.email = email;
	}
	public String getpassword() {
	return password;
	}
	public void setpassword(String body) {
	this.password = password;
	}
	
}
