package com.anirban.learnspringJWT.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.anirban.learnspringJWT.models.Users;

@Service
public class HomeService {

	public List<Users> getUsers() {
		List<Users> users = new ArrayList<>() ;
		
		users.add(new Users(1,"Anirban Das","anirban@xyz.com"));
		users.add(new Users(2,"Sourik Das","soutrik@xyz.com"));
		
		return users;
		
	}
	
	

}
