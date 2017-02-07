package com.zhjg.aop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AfterReturningAdvice {

	/**
	 * 使用@AfterReturning只能在业务方法执行成功并返回之后织入增强
	 * 可以方法业务方法的返回值，但不能进行处理
	 * returning指定的形参的类型可以起到过滤作用：仅代理被代理类中返回值类型与该形参类型一致的方法
	 * @param reval
	 */
	
	@AfterReturning(returning="reval", pointcut="execution(* com.zhjg.aop.service.impl.*.getUser(..))")
	public void excuteAfterServiceMethodReturn(Object reval){
		System.out.println("AfterReturning: execute after service method returning");
		System.out.println("AfterReturning: service method return value is: "+reval);
	}
}
