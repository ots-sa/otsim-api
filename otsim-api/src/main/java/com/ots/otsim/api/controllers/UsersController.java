package com.ots.otsim.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ots.otsim.api.model.User;
import com.ots.otsim.api.model.json.JSONUser;
import com.ots.otsim.api.repositories.UserRepository;

@RestController
@RequestMapping(path="/users") 
public class UsersController {
	@Autowired private UserRepository userRepository;
	

	@GetMapping(path="/all")
	public List<JSONUser> getAllUsers() {
		List<JSONUser> users = new ArrayList<>();
		for (User user : userRepository.findAll()) {
			users.add(new JSONUser(user));
		}
		return users;
	}
	
	@GetMapping(path="/get/{userId}")
	public @ResponseBody JSONUser getUser(@PathVariable("userId") Long userId) {
		return new JSONUser(userRepository.findOne(userId));
	}
	
	@PostMapping(path="/login")
	public @ResponseBody Boolean login(@RequestBody User user) {
		User userdb = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		return userdb!=null;
	}
}
