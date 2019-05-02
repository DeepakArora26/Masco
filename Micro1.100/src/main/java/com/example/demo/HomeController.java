package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	
	@Autowired
	Repo userRepository;
	
	@Autowired
	Users userDetail;
	
	@Autowired
	NewUserRepo newUserRepo;
	
	@Autowired
	RegisterDataModel registerDataModel;

	
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
	
	
	@RequestMapping("/registerUser")
	public String RegisterUser(@ModelAttribute RegisterDataModel user)
	{
		
		mongoTemplate.save(user);
		
		
		
		return "Registration";
	}
	
	

	@RequestMapping("/showUser")
	public void ShowUser()
	{
		registerDataModel=newUserRepo.findByUserName("Deepakarora26");
		
		System.out.println(registerDataModel.getMobileNo());
		
		

	}
	
	
	
	
	@RequestMapping("/accessDenied")
	public String ShowAccess()
	{
		return "accessdenied";

	}
	
	
	
	@RequestMapping("/activate")
	public ModelAndView Activate(ModelAndView model)
	{
		
		registerDataModel=newUserRepo.findByUserName("Deepakarora26");
		model.addObject("user",registerDataModel);
		model.setViewName("ActivateUser");
		
		return model;

	}
	
	
	
	@RequestMapping("/confirm")
	public String ShowConfirm()
	{
		return "Confirm";

	}
	
}
