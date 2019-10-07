package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vehicle;

public class JavaConfigAnnoTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Vehicle vehicle=null,vehicle1=null;
		
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean class object 
		vehicle=ctx.getBean("veh", Vehicle.class);
		vehicle1=ctx.getBean("veh", Vehicle.class);
		System.out.println(vehicle);
		System.out.println(vehicle);
		System.out.println(vehicle1==vehicle);    //here scope is prototype that by here two objects are created
		

		((AbstractApplicationContext) ctx).close();
		
	}

}
