package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtService;

public class NPJT_test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeMgmtService service=null;
		EmployeeDTO dto=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		service=ctx.getBean("empService",EmployeeMgmtService.class);
		
		System.out.println(service. getEmployeeById(190));
		System.out.println(".........................................................");
		System.out.println("Manage Detailes::"+service.getEmployeeByDesg("manager"));
		System.out.println("...........................................................");
		dto=new EmployeeDTO();
		dto.setEid(101);
		dto.setEname("Ahil");
		dto.setDesg("CEO");
		dto.setSalary(1000000);
		System.out.println(service.inserEmployee(dto));
				
		

		((AbstractApplicationContext) ctx).close();

	}

}
