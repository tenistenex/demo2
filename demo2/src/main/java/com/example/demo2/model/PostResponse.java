package com.example.demo2.model;

import org.springframework.http.HttpStatus;

public class PostResponse {
	String message;
	HttpStatus status;
	
	public String getMessage() {
		return message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	
	public void setStatus(HttpStatus status) {
		
		this.status = status;
		
	}
	
	public void setMessage(String message) {
		this.message = message;
	}


}
