package com.nt.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerfomanceMgmtAdvice implements MethodInterceptor {
	long start=0,end=0;
	
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object rateValue=null;
		start=System.currentTimeMillis();
		rateValue=invocation.proceed();
		end=System.currentTimeMillis();
		System.out.println(invocation.getMethod().getName()+" has taken "+(end-start)+" ms to execution");
		return rateValue;
	}

}
