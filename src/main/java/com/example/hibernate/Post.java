package com.example.hibernate;

import java.util.Set;
import javax.persistence.*;
import java.io.*;


@Entity
@Table(name="Posts")
public class Post{
//	@ManyToOne
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
	public String getContent(){
	return content;
	}
	public void setContent(String content){
	this.content = content;
	}
	public String getEmail(){
	return email;
	}
	public void setEmail(String email){
	this.email = email;
	}
}
