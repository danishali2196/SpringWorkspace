package com.nt.test;

import org.springframework.aop.framework.ProxyFactory;

import com.nt.advice.LoggingAspect;
import com.nt.beans.SalaryCalculator;

public class AfterAdviceTest {

	public static void main(String[] args) {
		
		ProxyFactory factory=new ProxyFactory();
		
		factory.setTarget(new SalaryCalculator());
		
		factory.addAdvice(new LoggingAspect());
		
		Object obj=factory.getProxy();

		SalaryCalculator calc = (SalaryCalculator) obj;
		
		calc.calcSalary(1542);
	}

}
