package com.example.demo2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.model.PostRequest;
import com.example.demo2.model.PostResponse;
import com.example.demo2.model.SampleResponse;

@RestController
public class WebController {
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<Map<String,Object>> Test(@RequestBody PostRequest inputPayload) {
		PostResponse response = new PostResponse();
		if (inputPayload.getUser().equals("admin") && inputPayload.getPassword().equals("123456")) {
			response.setMessage("Hello, admin");
			Map<String,Object> map = new HashMap<String,Object>();
		    map.put("message", "Hello, admin");
		    return new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
		//	return response;
		}
		else if (!inputPayload.getUser().equals("admin")) {
	//		response.setMessage("User does not exist”");
	//		response.setStatus(HttpStatus.FORBIDDEN);
			Map<String,Object> map = new HashMap<String,Object>();
		    map.put("message", "User does not exist");
		    return new ResponseEntity<Map<String,Object>>(map,HttpStatus.FORBIDDEN);
			
			//return response;
		}
		else if (inputPayload.getUser().equals("admin") && !inputPayload.getPassword().equals("123456")) {
	//		response.setMessage("Password error");
	//		response.setStatus(HttpStatus.FORBIDDEN);
			Map<String,Object> map = new HashMap<String,Object>();
		    map.put("message", "Password error");
		    return new ResponseEntity<Map<String,Object>>(map,HttpStatus.FORBIDDEN);
			//return response;
		}
		
		else {
			response.setMessage("Nope");
			Map<String,Object> map = new HashMap<String,Object>();
		    map.put("message", "Nope");
		    return new ResponseEntity<Map<String,Object>>(map,HttpStatus.BAD_REQUEST);
		//	return response;
		}
		
	}

}
