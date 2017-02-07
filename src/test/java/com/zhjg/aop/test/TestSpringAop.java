package com.zhjg.aop.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhjg.aop.pojo.User;
import com.zhjg.aop.service.UserService;

public class TestSpringAop {

	private ApplicationContext context;
	
	@Before
	public void initContext(){
		context =  new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void testBeforeAndAfterReturning(){
		UserService service = (UserService)context.getBean("userServiceImpl");
		service.getUser("1");
	}
	
	@Test(expected=ArithmeticException.class)
	public void testAfterThrowingAndAfter(){
		UserService service = (UserService)context.getBean("userServiceImpl");
		service.throwException();
	}
	
	@Test
	public void testAround(){
		UserService service = (UserService)context.getBean("userServiceImpl");
		User user = new User("1", "aa");
		System.out.println("参数>>>"+user.toString());
		user = service.modifyUser(user);
		System.out.println("返回值>>>"+user.toString());
	}
	
	@After
	public void destroyContext(){
		context = null;
	}
}
