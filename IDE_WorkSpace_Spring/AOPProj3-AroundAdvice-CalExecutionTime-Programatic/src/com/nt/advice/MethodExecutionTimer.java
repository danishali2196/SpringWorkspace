package com.nt.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MethodExecutionTimer implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
				
		String methodName = invocation.getMethod().getName();
		
		System.out.println(methodName+"  is  execution started");
		
		long start= System.currentTimeMillis();
		
		Object retVal=invocation.proceed();
		
		long end= System.currentTimeMillis();
		
		System.out.println(methodName+" is take time of execute is  ::"+ (end-start) +"ms");

		System.out.println(retVal);
		return retVal;
	}

}
