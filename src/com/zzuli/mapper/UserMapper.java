package com.zzuli.mapper;

import com.zzuli.po.User;

public interface UserMapper {
	public User findUser(User user)throws Exception;

	public void insertUser(User user);
}
