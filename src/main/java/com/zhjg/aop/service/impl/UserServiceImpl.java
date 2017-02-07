package com.zhjg.aop.service.impl;

import org.springframework.stereotype.Service;

import com.zhjg.aop.pojo.User;
import com.zhjg.aop.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public void addUser(User user) {
		System.out.println(user.toString()+"��ӳɹ�!");
	}

	@Override
	public void deleteUser(User user) {
		System.out.println(user.toString()+"ɾ���ɹ�!");
	}

	@Override
	public User modifyUser(User user) {
		System.out.println("�޸�֮ǰ��UserΪ"+user.toString());
		user.setName("bb");
		System.out.println("�޸�֮���UserΪ"+user.toString());
		return user;
	}

	@Override
	public User getUser(String id) {
		User user = new User(id, "aa");
		System.out.println("��ѯ���û�"+user.toString());
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
