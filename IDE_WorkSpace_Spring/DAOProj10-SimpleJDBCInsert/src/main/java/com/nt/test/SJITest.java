package com.nt.test;

import java.io.Closeable;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtService;

public class SJITest {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx=null;
		EmployeeMgmtService service=null;
		EmployeeDTO dto=null;
		Scanner scn=null;
		int eno=0,sal=0;
		String name=null,desg=null;
		
		scn=new Scanner(System.in);
		System.out.println("Enter EmpID");
		eno=scn.nextInt();
		System.out.println("Enter name");
		name=scn.next();
		System.out.println("Enter Desg");
		desg=scn.next();
		System.out.println("Enter Salary");
		sal=scn.nextInt();
		
		//set to DTO
		dto=new EmployeeDTO();
		dto.setEno(eno);
		dto.setEname(name);
		dto.setDesg(desg);
		dto.setSalary(sal);

		//create IOc Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("empService",EmployeeMgmtService.class);
		//invoke method
		System.out.println( service.registerEmployee(dto));
		
		((AutoCloseable) ctx).close();

	}

}
