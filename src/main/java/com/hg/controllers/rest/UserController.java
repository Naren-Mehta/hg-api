package com.hg.controllers.rest;

import java.util.ArrayList;
import com.hg.domain.User;
import com.hg.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/users")
	public List<User> getAllUsers() {

		return userService.getAllUsers();
	}

	@RequestMapping("/users/{userId}")
	public User getUser(@PathVariable Integer userId) {
		return userService.getUser(userId);
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {

		System.out.println("===="+user);
		userService.addUser(user);		
	}

}
