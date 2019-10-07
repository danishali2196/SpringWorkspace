package com.nt.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggerAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method mt, Object[] arrobj, Object obj) throws Throwable {
		
			        String met = mt.getName();
			        System.out.println(met + " is executed");
	}

}
