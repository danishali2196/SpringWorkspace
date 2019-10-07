package com.nt.dao;

import com.nt.bo.EmpBO;

public interface EmpDAO {
	
	public EmpBO  findEmpById(int no) throws Exception;

}
