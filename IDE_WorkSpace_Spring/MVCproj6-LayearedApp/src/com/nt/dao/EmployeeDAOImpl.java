package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_ALL_EMPLOYEE="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP";
	
	JdbcTemplate jt;

	public EmployeeDAOImpl(JdbcTemplate jt) {
		System.out.println("EmployeeDAOImpl.EmployeeDAOImpl()");
		this.jt = jt;
	}

	@Override
	public List<EmployeeBO> getEmployee() throws Exception{
		System.out.println("EmployeeDAOImpl.getEmployee()");
		List<EmployeeBO> listBO=null;
		System.out.println(jt);
		listBO= jt.query(GET_ALL_EMPLOYEE, new EmployeeExtractor());
		return listBO;
	}
	
	private class EmployeeExtractor implements ResultSetExtractor<List<EmployeeBO>>{

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeBO> listBo=new ArrayList();
			while (rs.next()) {
			
			EmployeeBO bo=new EmployeeBO();
			bo.setEmpNo(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSal(rs.getFloat(4));
			bo.setDeptNo(rs.getInt(5));
			//add bo to listBO
			listBo.add(bo);
			System.out.println(listBo);
			}
			return listBo;
		}
		
	}

}
