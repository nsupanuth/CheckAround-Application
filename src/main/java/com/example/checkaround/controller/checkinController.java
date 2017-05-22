package com.example.checkaround.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.checkaround.model.Checkins;
import com.example.checkaround.model.Users;

@RestController
public class checkinController {

	@RequestMapping(value = "/user",method = RequestMethod.POST)
	public List<Users> userCheckin(@RequestBody Users user){
		
		
		
		
		return null;
	}
	
	
	
	
}
