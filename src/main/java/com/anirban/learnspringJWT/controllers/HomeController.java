package com.anirban.learnspringJWT.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anirban.learnspringJWT.models.Users;
import com.anirban.learnspringJWT.service.HomeService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	HomeService homeService;
	

	@GetMapping("/users")
	public List<Users> getUser() {
		return homeService.getUsers();
	}
	
	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal) {
/*In Java security, the Principal interface is a fundamental part of the Java Authentication and Authorization Service (JAAS) framework. 
The Principal interface represents an entity (typically a user or a system) that is capable of being authenticated and authorized.*/		
		return principal.getName();
	}
}
