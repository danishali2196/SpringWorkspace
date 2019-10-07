package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_DETAIL_BY_ID="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	
	@Autowired
	private JdbcTemplate jt;
	
	public EmployeeBO findEmpById(int no) {
		BeanPropertyRowMapper<EmployeeBO>  rowMapper=null;
		EmployeeBO bo=null;
		rowMapper=new BeanPropertyRowMapper(EmployeeBO.class);
		bo=  jt.queryForObject(GET_EMP_DETAIL_BY_ID, rowMapper, no);
		
		return bo;
		
		
	}

}
