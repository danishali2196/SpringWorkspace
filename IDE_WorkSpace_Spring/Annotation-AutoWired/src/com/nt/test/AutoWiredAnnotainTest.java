package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vehicle;

public class AutoWiredAnnotainTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Vehicle v1=null;
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get bean
		v1=ctx.getBean("vehicle", Vehicle.class);
		
		System.out.println(v1);
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
