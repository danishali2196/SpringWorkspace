package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.dao.DeptDAOImpl;
import com.nt.service.ServiceMgmtDeptImpl;

@SpringBootApplication
@Import(AppConfig.class)
public class JdbcTemplate_test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ServiceMgmtDeptImpl service=null;
		//cteate IOC container
		ctx=SpringApplication.run(JdbcTemplate_test.class, args);
		
		
		//get bean class obj
		service=(ServiceMgmtDeptImpl) ctx.getBean("service");
		
		//invoke the method
		//select  operations
		System.out.println(service.findDeptCount());
		System.out.println(service.findDeptByNo(10));
		System.out.println(service.getAllDept());
		
		//non select operation
		//System.out.println(service.insertDept(1, "Account", "New Delhi"));
		System.out.println(service.updateDeptLoc(1, "Hyderabad"));
		System.out.println(service.deleteDeptByNo(1));
		
	}

}
