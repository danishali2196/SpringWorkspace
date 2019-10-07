package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer implements ApplicationContextAware{
	
	private String beanid;
	private ApplicationContext ctx=null;
	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}
	
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Cricketer.setApplicationContext()::0-param consructor");
		this.ctx=ctx;
		
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
		
		CricketBat cb=null;
	
		
		//create dependent class object
		cb=ctx.getBean(beanid, CricketBat.class);
		cb.proBat();
		
		((AbstractApplicationContext) ctx).close();
	}
	
}