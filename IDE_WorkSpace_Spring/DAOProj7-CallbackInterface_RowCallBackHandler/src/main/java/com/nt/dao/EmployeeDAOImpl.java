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

//@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_BY_SAL_RANGE="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE SAL>=? AND SAL<=?";
	 @Autowired
	private JdbcTemplate jt;

	@Override
	public List<EmployeeBO> searchEmpBySalRange(int startSal, int endSal) {
		List<EmployeeBO> listBO=new ArrayList();
		jt.query(GET_EMP_BY_SAL_RANGE, new EmployeeHandler(listBO), startSal,endSal);
		
		return listBO;
	}
	
	private static class EmployeeHandler implements RowCallbackHandler{
		List<EmployeeBO> listBO=new ArrayList();
		public EmployeeHandler(List<EmployeeBO> listBO) {
			this.listBO=listBO;
		}
		@Override
		public void processRow(ResultSet rs) throws SQLException {
			
			EmployeeBO bo=null;
			bo=new EmployeeBO();
			bo.setEmpno(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSal(rs.getInt(4));
			listBO.add(bo);
			
		}
		
	}

}
