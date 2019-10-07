package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor {
	
	Map<String,Object> cache=new HashMap();

	public Object invoke(MethodInvocation invocation) throws Throwable {
		String key=invocation.getMethod().getName()+Arrays.toString(invocation.getArguments());
		
		Object retValue=null;
		if (!cache.containsKey(key)) {
			retValue=invocation.proceed();
			cache.put(key, retValue);
			System.out.println("From Target Method");
			System.out.println("CacheAdvice.invoke()::"+key);
			return retValue;
		}
		
		retValue=cache.get(key);
		System.out.println("from cache");
		return retValue;
	}

}
