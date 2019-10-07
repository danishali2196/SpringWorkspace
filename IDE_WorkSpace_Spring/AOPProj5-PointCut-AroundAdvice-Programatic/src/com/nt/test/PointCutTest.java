package com.nt.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.nt.advice.CommonDynaPointCut;
import com.nt.advice.MethodExecutionTimer;
import com.nt.beans.MyApp;

public class PointCutTest {

	public static void main(String[] args) {
		
		//get proxy factory obj
		ProxyFactory factory=new ProxyFactory();

		factory.setTarget(new MyApp());
		
		DefaultPointcutAdvisor advicer=new DefaultPointcutAdvisor(new CommonDynaPointCut(),new MethodExecutionTimer());
		factory.addAdvisor(advicer);
		
		MyApp app = (MyApp)factory.getProxy();
		
		app.empSal("danish", 1000000);
		app.cal(1200, 4000);
	}

}
