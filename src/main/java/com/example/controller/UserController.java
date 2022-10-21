 package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/hash")
public class UserController {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId")Long userId) {
		
		User user=userservice.getUserId(userId);
		
		  List contacts= this.restTemplate.getForObject("http://localhost:9002/contact/user/" + user.getUserId(),List.class);
		  
		  
		  
		  
		
		user.setContats(contacts);
		
		return user;
	}

}
