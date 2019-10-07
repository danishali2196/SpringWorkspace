package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import com.nt.bo.CricketerBO;


public class CricDAOImpl implements CricDAO {
	private static final String GET_ALL_CRICKETERS="SELECT ID,NAME,AGE,RUNSODI,RUNSTEST,RUNST20 FROM CRICKETER_DETAIL";

	private JdbcTemplate jt;
	
	public CricDAOImpl(JdbcTemplate jt) {
		System.out.println("CricDAOImpl.CricDAOImpl()");
		this.jt = jt;
	}

	@Override
	public List<CricketerBO> getAllCricketers() {
		BeanPropertyRowMapper<CricketerBO>  bprm=null;
		List<CricketerBO>  listBO=null;
		
		bprm=new BeanPropertyRowMapper<CricketerBO>(CricketerBO.class);
		listBO=(List<CricketerBO>) jt.query(GET_ALL_CRICKETERS ,new RowMapperResultSetExtractor(bprm));
		
		return listBO;
	}//method


	/*@Override
	public List<CricketerBO> getAllCricketers() {
		List<CricketerBO> listBO=null;
		
		listBO=jt.query(GET_ALL_CRICKETERS, new CricketerRowMapper());
		
		return null;
	}
	
	private class CricketerRowMapper implements RowMapper<CricketerBO>{

		@Override
		public CricketerBO mapRow(ResultSet rs, int pos) throws SQLException {
			CricketerBO bo=new CricketerBO();
			bo.setId(rs.getInt(1));
			bo.setName(rs.getString(2));
			bo.setAge(rs.getInt(3));
			bo.setRunsodi(rs.getInt(4));
			bo.setRunstest(rs.getInt(5));
			bo.setRunst20(rs.getInt(6));
			
			System.out.println(bo);
			return bo;
			
		}
		
	}*/

}//class
