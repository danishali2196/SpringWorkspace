package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService service=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		service=ctx.getBean("pfb", BankService.class);
		
		System.out.println(service.simpleInstCalculation(100000, 2, 12));
		
		((AbstractApplicationContext) ctx).close();
	}

}
