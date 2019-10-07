package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer{
	
	private String beanid;
	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}
	public Cricketer() {
		System.out.println("Cricketer.Cricketer()::0 param constructor");
	}
	
	public void start() {
		System.out.println("match Started");
	}
	public void end() {
		System.out.println("match end");
	}
	
	
	public void play() {
		System.out.println("Cricketer.play()");
		ApplicationContext ctx=null;
		CricketBat cb=null;
		
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//create dependent class object
		cb=ctx.getBean(beanid, CricketBat.class);
		cb.proBat();
		
		((AbstractApplicationContext) ctx).close();
	}
}