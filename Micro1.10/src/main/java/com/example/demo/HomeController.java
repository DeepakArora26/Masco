package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
	
	@Autowired
	Repo userRepository;
	
	@Autowired
	Users userDetail;
	
	
	@Autowired
    protected MongoTemplate mongoTemplate;
	
	@RequestMapping("/")
	public String showhome()
	{
		return "home";
	}
	
	@RequestMapping("/login")
	public String showLogin()
	{
		return "Login";
	}
	
	@RequestMapping("/logout-success")
	public String showLogout()
	{
		return "Logout";
	}
	
	@RequestMapping("/register")
	public String showRegister()
	{
		return "Registration";
	}
	
	
	
}
