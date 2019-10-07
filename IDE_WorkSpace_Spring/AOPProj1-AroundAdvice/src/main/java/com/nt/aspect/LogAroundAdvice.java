package com.nt.aspect;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal=null;
		
		System.out.println("Entering into "+invocation.getMethod().getName()+" with Arguments "+Arrays.toString(invocation.getArguments()));
		
		//modify Argument Value
		Object[] args=invocation.getArguments();
		if(((Float)args[0])<50000) {
			args[1]=1.0f;
		}
		//controlling target method
		if(((Float)args[0])==0.0f ||  ((Float)args[1])==0.0f || ((Float)args[2])==0.0f) {
			return 0.0f;
		}
		else {
			retVal = invocation.proceed();
		}
		
		System.out.println("Leaving from "+invocation.getMethod().getName()+"  With arguments "+Arrays.toString( invocation.getArguments()));
		if (((Float)retVal)<=2500) {
			return retVal;
		}
		else
			return ((Float)retVal)+(((Float)retVal)*0.1f);
	}

}
