package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.FlipKart;

public class LooslyCoupleTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		FlipKart fp=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean class object
		fp=ctx.getBean("fpkt", FlipKart.class);
		//invoke method
		System.out.println(fp);
		
		((AbstractApplicationContext) ctx).close();		
		

	}

}
