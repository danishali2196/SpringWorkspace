package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;
import com.nt.dao.EmpStuDAO;

public abstract class EmpStuService {
	
	private EmpStuDAO dao;

	public EmpStuService() {
		System.out.println("EmpStuService::0-param constructor");
	}
	
	public abstract StudentBO getStudentBO();
	public abstract EmployeeBO getEmployeeBO();

	public void setDao(EmpStuDAO dao) {
		this.dao = dao;
	}
	
	public void processStudent(int id,String name,String addrs,String course) {
		System.out.println("processing Student Info");
		StudentBO stbo=getStudentBO();
		stbo.setId(id);
		stbo.setName(name);
		stbo.setAddrs(addrs);
		stbo.setCourse(course);
		//use dao
		dao.insertData(stbo);
		
	}
	
	public void processEmployee(int id,String name,String addrs,String desg) {
		System.out.println("Processing Employee Info ");
		EmployeeBO empbo=getEmployeeBO();
		empbo.setId(id);
		empbo.setName(name);
		empbo.setAddrs(addrs);
		empbo.setDesg(desg);
		//use Dao
		dao.insertData(empbo);
		
	}
	
	
	

}
