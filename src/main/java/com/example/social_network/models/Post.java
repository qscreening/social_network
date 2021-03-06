package com.example.social_network;

import java.util.Set;
import javax.persistence.*;
import java.io.*;
import java.io.Serializable;


@Entity
@Table(name="posts")
public class Post implements Serializable{
	@Id @GeneratedValue
	@Column (name = "userId")
        private int userId;
	@Column(name="content")
	private String content;
	@Column(name="email")
	private String email;

	@ManyToOne
	@JoinColumn(name="userId", insertable=false,updatable=false)
        private User user;
	
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
