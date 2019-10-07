package com.nt.dao;

import java.util.List;

import com.nt.bo.EmpBO;

public interface EmpDAO {
	
	public List<EmpBO> searchEmpByDesg(String desg)throws Exception;
	
}
