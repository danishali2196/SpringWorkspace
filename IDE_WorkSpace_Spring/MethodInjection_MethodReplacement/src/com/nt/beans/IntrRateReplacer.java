package com.nt.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrRateReplacer implements MethodReplacer {

	private float rate;
	
	
	
	public IntrRateReplacer() {
		System.out.println("IntrRateReplacer:0-param constructor");
		
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public Object reimplement(Object bean, Method method, Object[] args) throws Throwable {
		
		System.out.println("IntrRateReplacer.reimplement(-,-,-)");
		System.out.println("bean class::"+bean.getClass());
		System.out.println("method name::"+method.getName());
		System.out.println("method args:"+Arrays.toString(args));
		
		if (method.getName().equals("calcIntsAmount")) {
			float pamt=(float) args[0];
			float time=(float) args[1];
			return pamt*time*rate/100.0f;
			
		}
		else {
			return 0.0f;
		}
		
	}

}
