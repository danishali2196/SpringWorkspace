package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EmployeeMgmtService;

public class CallbackClientTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeMgmtService service=null;
		//create IOC container
		 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get service class object
		service=ctx.getBean("empService", EmployeeMgmtService.class);
		//invoke method
		System.out.println("7788 emp details::"+service.getEmpByDesg("SALESMAN"));
		
		((AbstractApplicationContext) ctx).close();
		
		
	}

	
}
