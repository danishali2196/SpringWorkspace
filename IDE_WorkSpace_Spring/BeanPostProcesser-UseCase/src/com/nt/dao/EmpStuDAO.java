package com.nt.dao;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;

public class EmpStuDAO  {

	public EmpStuDAO() {
		System.out.println("EmpStuDAO::0-param constructor");
		
	}
	
	public void insertData(StudentBO stbo ) {
		System.out.println("Student Data is");
		System.out.println(stbo.getId()+" "+stbo.getName()+" "+stbo.getAddrs()+" "+stbo.getCourse()+" "+stbo.getDoj());
	}
	
	public void insertData(EmployeeBO empbo) {
		System.out.println("Employee Data is");
		System.out.println(empbo.getId()+" "+empbo.getName()+" "+empbo.getAddrs()+" "+empbo.getDesg()+" "+empbo.getDoj());
		
	}

	
}
