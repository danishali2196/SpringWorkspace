package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String INSERT_EMPLOYEE="INSERT INTO EMPLOYEE VALUES(:eid,:ename,:desg,:salary)";
	
	@Autowired
	private SimpleJdbcInsert sji;
	
	public int insertEmployee(EmployeeBO bo) {
		Map<String,Object> param=null;
		int count=0;
		
		param=new HashMap<String, Object>();
		param.put("eid", bo.getEno());
		param.put("ename",bo.getEname());
		param.put("desg",bo.getDesg());
		param.put("salary",bo.getSalary());
		
		sji.setTableName("EMPLOYEE");
		count=sji.execute(param);
		return count;
	}

}
