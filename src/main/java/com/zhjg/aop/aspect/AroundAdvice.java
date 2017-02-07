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
	 * ʹ��@Around������ҵ�񷽷�ִ��ǰ֯����ǿҲ����ҵ�񷽷�ִ�к�֯����ǿ
	 * ��һ���βα���ΪProceedingJoinPoint����
	 * ͨ���ò������Ի�ȡҵ�񷽷��Ĳ���������ǩ��������������spring���ɵĴ������
	 * ���Ը�ע������޸�ҵ�񷽷��Ĳ����ͷ���ֵ������������ֹҵ�񷽷���ִ��
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
