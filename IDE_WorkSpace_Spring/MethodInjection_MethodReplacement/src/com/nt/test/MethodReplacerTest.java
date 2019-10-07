package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Bank;

public class MethodReplacerTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Bank bank=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean class object
		bank=ctx.getBean("bank",Bank.class);
		System.out.println("Intr Amt::"+bank.calcIntsAmount(100000, 12));
		
		((AbstractApplicationContext) ctx).close();

	}

}
