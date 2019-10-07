package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.ScheduleReminder;

public class FactoryBean_Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		ScheduleReminder reminder=null;
		
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		//create bean class object
		reminder=ctx.getBean("reminder",ScheduleReminder.class);
		System.out.println(reminder);
		
		
		((AbstractApplicationContext) ctx).close();
		
		
	}

}
