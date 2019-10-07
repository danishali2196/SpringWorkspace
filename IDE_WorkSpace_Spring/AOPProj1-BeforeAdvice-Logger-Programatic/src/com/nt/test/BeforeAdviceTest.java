package com.nt.test;

import java.util.logging.Logger;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import com.nt.advice.LoggerAdvice;
import com.nt.target.Calculator;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		
		ProxyFactory factory = new ProxyFactory();
		
		factory.setTarget(new Calculator());
		
		factory.addAdvice(new LoggerAdvice());
		
		Calculator cal=(Calculator) factory.getProxy();
		
		cal.add(15,20);
		cal.sub(20, 50);
		cal.mul(7, 8);
		cal.div(10, 2);

		System.out.println(cal.getClass().getName());
	}

}
