package com.nt.advice;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class LoggingAdvice implements ThrowsAdvice {
	
	public void afterThrowing(Method m, Object[] args, Object target, Exception ex) {
		
		String methodName=m.getName();
		
		
		System.out.println(ex.getClass()+" Exception is rised in "+methodName+" with args "+Arrays.toString(args)+" in "+target.getClass().getName());
		
	}

}
