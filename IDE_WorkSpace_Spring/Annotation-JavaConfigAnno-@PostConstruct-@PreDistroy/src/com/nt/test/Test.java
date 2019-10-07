package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoterApp;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		VoterApp va=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		va=ctx.getBean("voter", VoterApp.class);
		System.out.println(va.checkVoterEligibility());
		
		((AbstractApplicationContext) ctx).close();
	}

}
