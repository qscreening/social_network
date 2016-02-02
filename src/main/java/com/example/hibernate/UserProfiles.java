package com.example.hibernate;

import java.io.serializable;

import java.Sql.Blob;

@Entity
@Table(name="userProfiles")
public class UserProfiles implements serializable{
	@Column(name="userId")
	private int userId;	
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private double phone;
	@Column(name="image")
	private Blob image;

	public int getUserId(){
	return userId;
	}
	public void  setUserId(int userId){
	this.userId = userId;
	}
	public String getEmail(){
	return email;
	}
	public void setEmail(String email){
	this.email = email;
	}
	public double getPhone(){
	return phone;
	}
	public void setPhone(double phone){
	this.phone = phone;
	}
	public Blob getImage(){
	return image;
	}
	public void setImage(Blob image){
	this.image = image;
	}
}
