package com.nt.advice;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.nt.beans.MyApp;

public class CommonDynaPointCut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> target, Object... args) {
		
		if (target==MyApp.class  && method.getName().equals("cal") && (Integer)args[0]>=1000 && (Integer)args[1]<=5000 ) {
			return true;
		}
		
		return false;
	}

}
