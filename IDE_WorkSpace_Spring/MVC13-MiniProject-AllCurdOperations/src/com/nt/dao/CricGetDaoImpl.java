package com.nt.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import com.nt.bo.CricketerBO;

public class CricGetDaoImpl implements CricGetDao{
	private static final String GET_ALL_CRICKETERS="SELECT ID,NAME,AGE,RUNSODI,RUNSTEST,RUNST20 FROM CRICKETER_DETAIL";
//private static final String GET_ALL_EMPLOYEE="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP";
	
	JdbcTemplate jt;

	

	public CricGetDaoImpl(JdbcTemplate jt) {
		this.jt = jt;
	}





	@Override
	public List<CricketerBO> getCricketer() throws Exception {
		BeanPropertyRowMapper<CricketerBO>  bprm=null;
		List<CricketerBO>  listBO=null;
		
		bprm=new BeanPropertyRowMapper<CricketerBO>(CricketerBO.class);
		listBO=(List<CricketerBO>) jt.query(GET_ALL_CRICKETERS,new RowMapperResultSetExtractor(bprm));
		
		return listBO;
	}

}
