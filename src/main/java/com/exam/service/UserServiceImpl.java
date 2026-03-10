package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.UserDao;
import com.exam.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> userList() throws Exception{
		System.out.println("정보 요청 중");
		List<User> userList = userDao.userList();
		return userList;
	}
}
