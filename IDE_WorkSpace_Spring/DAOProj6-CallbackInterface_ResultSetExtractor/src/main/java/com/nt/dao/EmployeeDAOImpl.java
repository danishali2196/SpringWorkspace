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
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

//@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	 @Autowired
	JdbcTemplate jt;
	 
	public List<EmployeeBO> findEmpByDesg(String desg) {
		List<EmployeeBO> listBO=jt.query(GET_EMP_BY_DESG, new EmpExtractor(), desg);
		
		return listBO;
	}
	
	public static class EmpExtractor implements ResultSetExtractor<List<EmployeeBO>>{

		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeBO> listBO=new ArrayList<EmployeeBO>();
			while(rs.next()) {
				EmployeeBO bo=null;
				bo=new EmployeeBO();
				bo.setEmpno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSal(rs.getInt(4));
				listBO.add(bo);
			}
			return listBO;
		}

	
		
	}
	
	

}
