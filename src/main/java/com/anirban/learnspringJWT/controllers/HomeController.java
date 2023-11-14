package com.anirban.learnspringJWT.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}
