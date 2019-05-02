package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;



@Component
@Document(collection="UserDetail")
public class Users {
	
	@Id
	private String UserID;
	private String username;
	private String password;
	private String role;
	private long Seq;

	
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public long getSeq() {
		return Seq;
	}
	public void setSeq(long seq) {
		Seq = seq;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	

	

}
