package com.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.Entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class Usercontroller {

	@GetMapping("/signup")
	public String showSignUpForm(User user ) {
		return "add-user";
	}
	
	@PostMapping("/adduser")
	public String adduser(@RequestBody String entity) {
		//TODO: process POST request
		
		return entity;
	}
	
	
	

}
