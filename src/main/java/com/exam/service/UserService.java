package com.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exam.model.User;

public interface UserService {
	
	public List<User> userList() throws Exception;
}
