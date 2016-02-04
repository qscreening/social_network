package com.example.social_network;

import java.util.Set;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="groupMembers")
public class GroupMember implements Serializable{
	
	@Id
	@Column(name="memberId")
	private int memberId;
	@Column(name="groupId")
	private int groupId;
	@Column(name="groupAdmin")
	private boolean groupAdmin;

	public int getMemberId(){
	return groupId;
	}
	public void setMemberId(int memberId){
	this.memberId = memberId;
	}
	public int getGroupId(){
	return groupId;
	}
	public void setGroupId(int groupId){
	this.groupId = groupId;
	}
	public boolean getGroupAdmin(){
	return groupAdmin;
	}
	public void setGroupAdmin(boolean groupAdmin){
	this.groupAdmin = groupAdmin;
	}
	
}
