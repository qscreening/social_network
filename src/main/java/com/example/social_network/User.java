package com.example.social_network;

import java.util.Set;
import javax.persistence.*;
import java.io.*;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name="users")
public class User implements Serializable{
	@Id
	@OneToOne(mappedBy="user")
   	private UserProfile userProfile;

	@Column(name="userId")
	private int userId;
	@Column(name="userName")
	private String userName;	
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;

	public int getUserId(){
	return userId;
	}
	public void setUserId(int userId){
	this.userId = userId;
	}
	public String getUserName(){
	return userName;
	}
	public void setUserName(String userName){
	this.userName = userName;
	}
	public String getEmail(){
	return email;
	}
	public void setEmail(String email){
	this.email = email;
	}
	public String getPassword(){
	return password;
	}
	public void setPassword(String password){
	this.password = password;
	}
	
}
