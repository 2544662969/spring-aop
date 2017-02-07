package com.zhjg.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.zhjg.aop.pojo.User;

@Aspect
@Component
@Order(1)
public class AroundAdvice {
	
	/**
	 * 使用@Around即可在业务方法执行前织入增强也可在业务方法执行后织入增强
	 * 第一个形参必须为ProceedingJoinPoint类型
	 * 通过该参数可以获取业务方法的参数，方法签名，被代理对象和spring生成的代理对象
	 * 所以该注解可以修改业务方法的参数和返回值，甚至可以阻止业务方法的执行
	 * @param jp
	 * @return
	 * @throws Throwable
	 */
	
	@Around("execution(* com.zhjg.aop.service.impl.*.modifyUser(..))")
	public Object doAroundServiceMethod(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("Around:execute before service method");
		User user = (User) jp.getArgs()[0];
		user.setId("2");
		System.out.println("Around: i can change the arguement");
		Object reval = jp.proceed(new Object[]{user});
		user = (User)reval;
		user.setName("cc");
		System.out.println("Around: i can change the return value");
		System.out.println("Around:execute after service method");
		return user;
	}

}
