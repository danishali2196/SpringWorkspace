package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	
	//public EmployeeBO findEmpById(int no);
	public List<EmployeeBO> findEmpByDesg(String desg);	

}
