package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMPLOYEE_BY_ID="SELECT EID,ENAME,DESG,SALARY FROM EMPLOYEE WHERE EID=:NO";
	private static final String GET_EMPLOYEE_BY_DESG="SELECT EID,ENAME,DESG,SALARY FROM EMPLOYEE WHERE DESG=:desg";
	private static final String INSERT_QUERY="INSERT INTO EMPLOYEE VALUES(:eid,:ename,:desg,:salary)";
	@Autowired
	private NamedParameterJdbcTemplate npjt;

	public EmployeeBO getEmployeeById(int no) {
	
		 MapSqlParameterSource param=new MapSqlParameterSource();
		 EmployeeBO bo=null;
		param.addValue("NO", no);
		bo=npjt.queryForObject(GET_EMPLOYEE_BY_ID, param, (rs, index )-> {
			EmployeeBO bo1=new EmployeeBO();
			bo1.setEid(rs.getInt(1));
			bo1.setEname(rs.getString(2));
			bo1.setDesg(rs.getString(3));
			bo1.setSalary(rs.getInt(4));
			return bo1;
		});
	
		
		return bo;
	}//method

	@Override
	public List<EmployeeBO> getEmployeeByDesg(String desg) {
		List<EmployeeBO> listBO=new ArrayList();
		 Map<String, Object> param=new HashMap();
		param.put("desg", desg);
		npjt.query(GET_EMPLOYEE_BY_DESG, param, rs->{
			//List<EmployeeBO> listBO1=new ArrayList();
			EmployeeBO bo=new EmployeeBO();
			bo.setEid(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setDesg(rs.getString(3));
			bo.setSalary(rs.getInt(4));
			listBO.add(bo);
			//			@Override
//			public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
//				List<EmployeeBO> listBO1=new ArrayList();
//				EmployeeBO bo=new EmployeeBO();
//				bo.setEid(rs.getInt(1));
//				bo.setEname(rs.getString(2));
//				bo.setDesg(rs.getString(3));
//				bo.setSalary(rs.getInt(4));
//				listBO1.add(bo);
//				
//			}
		}) ;
		return listBO;
	}

	@Override
	public int insertEmployee(EmployeeBO bo) {
		BeanPropertySqlParameterSource param=new  BeanPropertySqlParameterSource(bo);
		int result=npjt.update(INSERT_QUERY, param);
		return result;
	}

}//class
