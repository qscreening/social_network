package com.example.social_network;

import java.util.Set;
import javax.persistence.*;
import java.io.*;


@Entity
@Table(name="Posts")
public class Post{
        @OneToMany
        @Column(name = "UserId")
        private int UserId;
	@Column(name="content")
	private String content;
	@Column(name="email")
	private String email;
	public int getUserId(){
	return UserId;
	}
	public void setUserId(int userId){
	this.UserId = UserId;
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
