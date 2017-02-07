package com.zhjg.aop.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AfterThrowingAdvice {

	/**
	 * 使用@AfterThrowing只能在业务方法抛出异常之后织入增强
	 * throwing：指定的异常的类型可以起到过滤作用：仅代理抛出指定的异常的方法
	 * @param ex
	 */
	
	@AfterThrowing(throwing="ex", pointcut="execution(* com.zhjg.aop.service.impl.*.throw*(..))")
	public void doWhenServiceMethodThrowException(Throwable ex){
		System.out.println("AfterThrowing:execute when service method throw exception");
		System.out.println("AfterThrowing:the exception is: "+ex);
		System.out.println("AfterThrowing:dealing the exception");
	}
}
