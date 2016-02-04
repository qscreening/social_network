package com.example.social_network;

import java.util.Set;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="groups")
public class Group implements Serializable{
	
	@Id
	@Column(name="groupId")
	private int groupId;
	@Column(name="groupName")
	private String groupName;
	@Column(name="groupAdmin")
	private int groupAdmin;

	public int getGroupId(){
	return groupId;
	}
	public void setGroupId(int groupId){
	this.groupId = groupId;
	}
	public String getGroupName(){
	return groupName;
	}
	public void setGroupName(String groupName){
	this.groupName = groupName;
	}
	public int getGroupAdmin(){
	return groupAdmin;
	}
	public void setGroupAdmin(int groupAdmin){
	this.groupAdmin = groupAdmin;
	}
	
}
