package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Employee emp=null;
		
		//create IoC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get bean class object
		emp=ctx.getBean("emp" , Employee.class);
		//invoke the method
		System.out.println(emp);
		
		//close Ioc container
		((AbstractApplicationContext) ctx).close();
		

	}

}
