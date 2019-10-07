package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.MyWebContainer;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx;
		MyWebContainer container;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get bean
		container=ctx.getBean("container",MyWebContainer.class);
		
		//process the request
		container.processRequest("hi");
		container.processRequest("hello");
		System.out.println("==========================");
		container.processRequest("hi");
		container.processRequest("hello");
		
		((AbstractApplicationContext) ctx).close();
	}

}
