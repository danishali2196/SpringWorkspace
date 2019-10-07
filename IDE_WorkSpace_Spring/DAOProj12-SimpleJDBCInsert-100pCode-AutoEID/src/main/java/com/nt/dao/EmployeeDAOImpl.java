package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String INSERT_EMPLOYEE="INSERT INTO EMPLOYEE VALUES(:eid,:ename,:desg,:salary)";
	private static final String GET_EID="SELECT EMP_SEQ.NEXTVAL FROM DUAL";
	
	@Autowired
	private SimpleJdbcInsert sji;
	
	private int getEmpID() {
		JdbcTemplate jt=null;
		int eno=0;
		
		jt=sji.getJdbcTemplate();
		eno=jt.queryForObject(GET_EID, Integer.class);
		return eno;
	}
	
	public int insertEmployee(EmployeeBO bo) {
		Map<String,Object> param=null;
		int count=0;
		
		param=new HashMap<String, Object>();
		param.put("eid", getEmpID());
		param.put("ename",bo.getEname());
		param.put("desg",bo.getDesg());
		param.put("salary",bo.getSalary());
		
		sji.setTableName("EMPLOYEE");
		count=sji.execute(param);
		return count;
	}

}
