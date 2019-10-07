package com.nt.test;

import org.springframework.aop.framework.ProxyFactory;

import com.nt.advice.MethodExecutionTimer;
import com.nt.beans.MyApp;

public class AroundAdviceTest {

	public static void main(String[] args) {
		
		//get proxy factory obj
		ProxyFactory factory=new ProxyFactory();

		factory.setTarget(new MyApp());
		
		factory.addAdvice(new MethodExecutionTimer());
		
		MyApp app = (MyApp)factory.getProxy();
		
		app.empSal("danish", 1000000);
	}

}
