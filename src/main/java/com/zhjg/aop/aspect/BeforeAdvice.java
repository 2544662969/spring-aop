package com.zhjg.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class BeforeAdvice {

	/**
	 * 使用@Before只能在业务方法执行之前织入增强处理
	 * 无法阻止业务方法的执行，不能处理业务方法的返回值
	 * 因为此时业务方法还未执行
	 */
	
	@Before("execution(* com.zhjg.aop.service.impl.*.getUser(..))")
	public void doBeforServiceMethod(){
		System.out.println("BeforeAdvice:execute before service method");
	}
}
