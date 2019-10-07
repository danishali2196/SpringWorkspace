package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.AadharDetails;

public class ClientApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		AadharDetails aadhar=null;
		
		//create IOC container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get bean class object
		aadhar=ctx.getBean("aCard",AadharDetails.class );
		
		System.out.println(aadhar);
		
		((AbstractApplicationContext) ctx).close();
	}

}
