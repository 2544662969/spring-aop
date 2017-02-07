package com.zhjg.aop.service.impl;

import org.springframework.stereotype.Service;

import com.zhjg.aop.pojo.User;
import com.zhjg.aop.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public void addUser(User user) {
		System.out.println(user.toString()+"添加成功!");
	}

	@Override
	public void deleteUser(User user) {
		System.out.println(user.toString()+"删除成功!");
	}

	@Override
	public User modifyUser(User user) {
		System.out.println("修改之前的User为"+user.toString());
		user.setName("bb");
		System.out.println("修改之后的User为"+user.toString());
		return user;
	}

	@Override
	public User getUser(String id) {
		User user = new User(id, "aa");
		System.out.println("查询到用户"+user.toString());
		return user;
	}

	@Override
	public int test(int i){
		return i;
	}

	@SuppressWarnings("unused")
	@Override
	public void throwException(){
		int i = 1/0;
	}
}
