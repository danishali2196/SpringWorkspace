package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	
	public EmployeeBO getEmployeeById(int no);
	public List<EmployeeBO> getEmployeeByDesg(String desg);
	
	public int insertEmployee(EmployeeBO bo);

}
