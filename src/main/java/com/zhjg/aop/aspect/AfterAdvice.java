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
	 * ʹ��@Afterֻ����ҵ�񷽷�ִ��֮��֯����ǿ
	 * ����ҵ�񷽷��ɹ����ػ����׳��쳣��ִ��֯��
	 * һ�������ͷ���Դ
	 */
	
	@After("execution(* com.zhjg.aop.service.impl.*.throw*(..))")
	public void doEitherSuccessOrException(){
		System.out.println("After:execute after service method either success or exception");
		System.out.println("After:usually used to release the resource");
	}
}
