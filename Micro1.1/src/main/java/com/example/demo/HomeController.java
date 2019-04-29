package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
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
	

}
