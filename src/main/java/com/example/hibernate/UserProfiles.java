package com.example.hibernate;

import java.io.serializable;

import java.Sql.Blob;

@Entity
@Table(name="userProfiles")
public class UserProfile implements serializable{
	@Column(name="userId")
	private int userId;	
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private double phone;
	@Column(name="image")
	private Blob image;

	public int getuserId(){
	return userId;
	}
	public void  setuserId(int userId){
	this.userId = userId;
	}
	public String getemail(){
	return email;
	}
	public void setemail(String email){
	this.email = email;
	}
	public double getphone(){
	return phone;
	}
	public void setphone(double phone){
	this.phone = phone;
	}
	public Blob getimage(){
	return image;
	}
	public void setimage(Blob image){
	this.image = image;
	}
}
