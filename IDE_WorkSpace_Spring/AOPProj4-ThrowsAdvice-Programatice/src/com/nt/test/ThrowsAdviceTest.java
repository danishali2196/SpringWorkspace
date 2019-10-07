package com.nt.test;

import org.springframework.aop.framework.ProxyFactory;

import com.nt.advice.LoggingAdvice;
import com.nt.beans.EmployeeRegistration;

public class ThrowsAdviceTest {

	public static void main(String[] args) {
		
		ProxyFactory factory=new ProxyFactory();
		
		factory.setTarget(new EmployeeRegistration());
		factory.addAdvice(new LoggingAdvice());
		
		EmployeeRegistration emp=(EmployeeRegistration) factory.getProxy();
		
		emp.emp(null, 554);
	}
}
