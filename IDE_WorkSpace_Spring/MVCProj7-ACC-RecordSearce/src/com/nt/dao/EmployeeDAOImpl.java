package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.EmployeeBO;
import com.nt.bo.EmployeeResultBO;

public class EmployeeDAOImpl implements EmployeeDAO {
//	SQL> select empno,ename,sal,job from emp where empno=7900 or ename='SMITH' or job='MANAGER' or sal=5000;
 private static final String SEARCH_EMPLOYEE="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=? OR ENAME=? OR JOB=? OR SAL=?";
	
 private JdbcTemplate jt;
 
 public EmployeeDAOImpl(JdbcTemplate jt) {
	this.jt = jt;
}

@Override
	public List<EmployeeResultBO> getEmployee(EmployeeBO bo) {
		List<EmployeeResultBO> listRBO=null;
		
		listRBO=jt.query(SEARCH_EMPLOYEE,new EmpRowMapper(),bo.getEmpNo(),bo.getEname(),bo.getJob(),bo.getSal());
		
	
	return listRBO;
	}

 private static final class EmpRowMapper implements RowMapper<EmployeeResultBO>{

	@Override
	public EmployeeResultBO mapRow(ResultSet rs, int arg) throws SQLException {
		//copy resltSet Obj into EmployeeResultBo
		EmployeeResultBO rbo=new EmployeeResultBO();
		rbo.setEmpNo(rs.getInt(1));
		rbo.setEname(rs.getString(2));
		rbo.setJob(rs.getString(3));
		rbo.setSal(rs.getFloat(4));
		return rbo;
	}

 }

}
