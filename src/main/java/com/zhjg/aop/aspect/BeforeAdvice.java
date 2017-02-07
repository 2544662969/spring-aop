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
	 * ʹ��@Beforeֻ����ҵ�񷽷�ִ��֮ǰ֯����ǿ����
	 * �޷���ֹҵ�񷽷���ִ�У����ܴ���ҵ�񷽷��ķ���ֵ
	 * ��Ϊ��ʱҵ�񷽷���δִ��
	 */
	
	@Before("execution(* com.zhjg.aop.service.impl.*.getUser(..))")
	public void doBeforServiceMethod(){
		System.out.println("BeforeAdvice:execute before service method");
	}
}
