package com.example.demo;

import java.time.LocalDate;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.stereotype.Component;

@Component
@Document(collection="NewUser")
public class RegisterDataModel {
	
	
	private String firstName;
	private String lastName;
	private String userName;
	private long mobileNo;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dOB;
	private String emailId;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public LocalDate getdOB() {
		return dOB;
	}
	public void setdOB(LocalDate dOB) {
		this.dOB = dOB;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	


	
	

}
