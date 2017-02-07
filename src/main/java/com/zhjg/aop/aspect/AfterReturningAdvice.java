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
	 * ʹ��@AfterReturningֻ����ҵ�񷽷�ִ�гɹ�������֮��֯����ǿ
	 * ���Է���ҵ�񷽷��ķ���ֵ�������ܽ��д���
	 * returningָ�����βε����Ϳ����𵽹������ã��������������з���ֵ��������β�����һ�µķ���
	 * @param reval
	 */
	
	@AfterReturning(returning="reval", pointcut="execution(* com.zhjg.aop.service.impl.*.getUser(..))")
	public void excuteAfterServiceMethodReturn(Object reval){
		System.out.println("AfterReturning: execute after service method returning");
		System.out.println("AfterReturning: service method return value is: "+reval);
	}
}
