package com.zzuli.service;

import com.zzuli.po.User;

public interface UserService {
	public User findUser(User user)throws Exception;

	public void insertUser(User user);
}
