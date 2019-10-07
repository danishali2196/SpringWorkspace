package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl2 implements EmployeeDAO {
	private static final String GET_EMP_BY_SAL_RANGE="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE SAL>=? AND SAL<=?";
	 @Autowired
	private JdbcTemplate jt;

	@Override
	public List<EmployeeBO> searchEmpBySalRange(int startSal, int endSal) {
		System.out.println("EmployeeDAOImpl2.searchEmpBySalRange()");
		List<EmployeeBO> listBO=null;
		BeanPropertyRowMapper<EmployeeBO> rowMapper=null;
		rowMapper=new BeanPropertyRowMapper(EmployeeBO.class);
		listBO=jt.query(GET_EMP_BY_SAL_RANGE, rowMapper, startSal,endSal);
		return listBO;
	}

}
