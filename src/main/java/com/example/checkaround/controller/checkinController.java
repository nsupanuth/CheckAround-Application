package com.example.checkaround.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.checkaround.model.Checkins;
import com.example.checkaround.model.Users;
import com.example.checkaround.repository.UserRepository;

@RestController
public class checkinController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/user",method = RequestMethod.POST)
	public List<Users> userCheckin(@RequestBody Users user){
		userRepository.save(user);
		return userRepository.findAll();
	}
	
	@RequestMapping(value = "user/{page}/checkin",method = RequestMethod.POST)
	public List<Users> replies(@PathVariable("page") int page,@RequestBody Checkins checkin){
		
		Users u = userRepository.findOne(page);
		u.getCheckins().add(checkin);
		userRepository.save(u);
		
		return userRepository.findAll();

	}
	
	
}
