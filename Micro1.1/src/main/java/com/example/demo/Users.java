package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;


	

@Component
@Document(collection="UserDetail")
public class Users {
	
	
	private String username;
	private String password;

	
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
	

	

}
