package com.nt.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ServiceMgmtDeptImpl;

public class JdbcTemplate_test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=null;
		ServiceMgmtDeptImpl service=null;
		//cteate IOC container
		ctx=new ClassPathXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles("uat");
		ctx.setConfigLocation("com/nt/cfgs/applicationContext.xml");
		ctx.refresh();
		
		//get bean class obj
		service=(ServiceMgmtDeptImpl) ctx.getBean("service");
		
		//invoke the method
		//select  operations
		System.out.println(service.findDeptCount());
		System.out.println(service.findDeptByNo(10));
		System.out.println(service.getAllDept());
		System.out.println("Active Profile:::"+Arrays.toString( ctx.getEnvironment().getActiveProfiles()));
		//non select operation
		//System.out.println(service.insertDept(1, "Account", "New Delhi"));
//		System.out.println(service.updateDeptLoc(1, "Hyderabad"));
//		System.out.println(service.deleteDeptByNo(1));
		
		
		ctx.close();
	}

}
