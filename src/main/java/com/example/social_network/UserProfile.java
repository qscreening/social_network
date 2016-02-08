package com.example.social_network;
 
import java.util.Set;
import javax.persistence.*;
import java.io.*;
import java.io.Serializable;
import java.io.*;
@Entity
@Table(name="userProfiles")
public class UserProfile implements Serializable{
        @Id
	@GeneratedValue
	@Column(name="userId")
        private int userId;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private long phone;
       
	@OneToOne
	@PrimaryKeyJoinColumn
	private User user;

/*	public User getUser() {
        return this.user;
        }

        public void setUser(User user) {
        this.user = user;
        }
*/
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
	public long getPhone(){
	return phone;
	}
	public void setPhone(long phone){
	this.phone = phone;
	}
    	
}
