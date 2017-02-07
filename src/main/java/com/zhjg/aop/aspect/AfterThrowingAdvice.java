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
	 * ʹ��@AfterThrowingֻ����ҵ�񷽷��׳��쳣֮��֯����ǿ
	 * throwing��ָ�����쳣�����Ϳ����𵽹������ã��������׳�ָ�����쳣�ķ���
	 * @param ex
	 */
	
	@AfterThrowing(throwing="ex", pointcut="execution(* com.zhjg.aop.service.impl.*.throw*(..))")
	public void doWhenServiceMethodThrowException(Throwable ex){
		System.out.println("AfterThrowing:execute when service method throw exception");
		System.out.println("AfterThrowing:the exception is: "+ex);
		System.out.println("AfterThrowing:dealing the exception");
	}
}
