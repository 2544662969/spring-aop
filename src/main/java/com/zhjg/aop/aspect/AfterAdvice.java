package com.zhjg.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AfterAdvice {
	
	/**
	 * 使用@After只能在业务方法执行之后织入增强
	 * 无论业务方法成功返回还是抛出异常都执行织入
	 * 一般用于释放资源
	 */
	
	@After("execution(* com.zhjg.aop.service.impl.*.throw*(..))")
	public void doEitherSuccessOrException(){
		System.out.println("After:execute after service method either success or exception");
		System.out.println("After:usually used to release the resource");
	}
}
