package com.example.hibernate;

import java.io.serializable;

@Entity
@Table(name="Videos")
public class Videos implements serializable{

	@Column(name="userId")
	private int userId;
	@Column(name="content")
	private String content;
	@Column(name="email")
	private String email;
	
	public int getuserId(){
	return userId;
	}
	public void setuserId(int userId){
	this.userId = userId;
	}
	public int getcontent(){
	return content;
	}
	public void setcontent(String content){
	this.content = content;
	}
	public int getemail(){
	return email;
	}
	public void setemail(String email){
	this.email = email;
	}
}
