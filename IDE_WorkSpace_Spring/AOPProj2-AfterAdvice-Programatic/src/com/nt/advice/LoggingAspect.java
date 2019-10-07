package com.nt.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

public class LoggingAspect implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] arg2, Object arg3) throws Throwable {
		
		 String methodName = method.getName();
		 System.out.println(methodName.getClass().getName()+"     "+methodName);
		 
		 System.out.println("method is executed" + methodName);
		 
		 System.out.println(returnValue);
		
	}

	

	

}
