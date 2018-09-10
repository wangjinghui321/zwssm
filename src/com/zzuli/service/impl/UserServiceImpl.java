package com.zzuli.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.zzuli.mapper.UserMapper;
import com.zzuli.po.User;
import com.zzuli.service.UserService;
@Transactional
public class UserServiceImpl implements UserService {
	
	//×¢Èëmapper
	@Autowired
	private UserMapper userMapper;
	@Override
	public User findUser(User user) throws Exception {
		
		return userMapper.findUser(user);
	}
	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
		
	}

}
