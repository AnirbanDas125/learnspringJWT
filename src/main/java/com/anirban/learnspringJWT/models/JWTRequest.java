package com.anirban.learnspringJWT.models;

public class JWTRequest {

	private String email;
	private String passowrd;
	
	public JWTRequest() {
		
	}
	public JWTRequest(String email, String passowrd) {
		super();
		this.email = email;
		this.passowrd = passowrd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassowrd() {
		return passowrd;
	}
	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
	
	

}
