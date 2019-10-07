package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EmpStuService;

public class ClientTestApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmpStuService service=null;
		
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get bean class object
		service=ctx.getBean("service",EmpStuService.class);
		
		
		service.processStudent(101, "asif", "hyd", "civil");
		service.processEmployee(102, "hk", "hyd", "faculty");
		
		
		((AbstractApplicationContext) ctx).close();

	}

}
