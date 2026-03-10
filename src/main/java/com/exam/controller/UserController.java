package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.User;
import com.exam.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/bringD")
	public List<User> bringData() throws Exception {
		System.out.println("TRAX - scorpio");
		return userService.userList();
	}
}
