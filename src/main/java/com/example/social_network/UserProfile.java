package com.example.social_network;
 
import java.util.Set;
import javax.persistence.*;
import java.io.*;
import java.io.Serializable;

@Entity
@Table(name="userProfiles")
public class UserProfile implements Serializable {
	@Id
	//@OneToOne
	//@JoinColumn(name ="userId")
	//public User user;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private double phone;
//	@Column(name="image")
//	private Image image;


	/*public int getUserId(){
	return userId;
	}
	public void  setUserId(int userId){
	this.userId = userId;
	}*/
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
/*	public Blob getImage(){
	return image;
	}
	public void setImage(Blob image){
	this.image = image;
	}*/
}
