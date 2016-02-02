package com.example.hibernate;

import java.io.serializable;

@Entity
@Table(name="Links")
public class Links implements serializable{

	@Column(name="userId")
	private int userId;
	@Column(name="content")
	private String content;
	@Column(name="email")
	private String email;
	
	public int getUserId(){
	return userId;
	}
	public void setUserId(int userId){
	this.userId = userId;
	}
	public int getContent(){
	return content;
	}
	public void setContent(String content){
	this.content = content;
	}
	public int getEmail(){
	return email;
	}
	public void setEmail(String email){
	this.email = email;
	}
}
