package com.zhjg.aop.service;

import com.zhjg.aop.pojo.User;

public interface UserService {

	public void addUser(User user);
	
	public void deleteUser(User user);
	
	public User modifyUser(User user);
	
	public User getUser(String id);
	
	public int test(int i);
	
	public void throwException();
}
