package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import com.nt.bo.CricketerBO;

public class CricDAOImpl implements CricDAO {
	private static final String GET_ALL_CRICKETERS="SELECT ID,NAME,AGE,RUNSODI,RUNSTEST,RUNST20 FROM CRICKETER_DETAIL";
	private static final String GET_CRICKETER_BY_ID="SELECT ID,NAME,AGE,RUNSODI,RUNSTEST,RUNST20 FROM CRICKETER_DETAIL WHERE ID=?";
	private static final String INSERT_CRICKETERS="INSERT INTO   CRICKETER_DETAIL VALUES(?,?,?,?,?,?)";
	private static final String UPDATE_CRICKETERS="UPDATE CRICKETER_DETAIL SET  NAME=?,AGE=?,RUNSODI=?,RUNSTEST=?,RUNST20=? WHERE ID=?";
	private static final String DELETE_CRICKETER="DELETE FROM CRICKETER_DETAIL WHERE ID = ?";
	
	private JdbcTemplate jt;
	
	public CricDAOImpl(JdbcTemplate jt) {
		System.out.println("CricDAOImpl.CricDAOImpl()");
		this.jt = jt;
	}

	@Override
	public int insertCricketer(CricketerBO bo) {
		int count=0;
		
		count = jt.update(INSERT_CRICKETERS,bo.getId(),bo.getName(),bo.getAge(),bo.getRunsodi(),bo.getRunstest(),bo.getRunst20());
		
		return count;
	}

	@Override
	public List<CricketerBO> getCricketer() throws Exception {
		BeanPropertyRowMapper<CricketerBO>  bprm=null;
		List<CricketerBO>  listBO=null;
		
		bprm=new BeanPropertyRowMapper<CricketerBO>(CricketerBO.class);
		listBO=(List<CricketerBO>) jt.query(GET_ALL_CRICKETERS,new RowMapperResultSetExtractor(bprm));
		
		return listBO;
	}
	
	@Override
	public CricketerBO searchCricketerById(int no) {
		CricketerBO bo=null;
		bo=jt.queryForObject(GET_CRICKETER_BY_ID, new CricketerRowMapper(), no);
		return bo;
	}
	
	private class CricketerRowMapper implements RowMapper<CricketerBO>{

		@Override
		public CricketerBO mapRow(ResultSet rs, int arg1) throws SQLException {
			CricketerBO bo=new CricketerBO();
			bo.setId(rs.getInt(1));
			bo.setName(rs.getString(2));
			bo.setAge(rs.getInt(3));
			bo.setRunsodi(rs.getInt(4));
			bo.setRunstest(rs.getInt(5));
			bo.setRunst20(rs.getInt(6));
			return bo;
		}

	}

	@Override
	public int editCricketer(CricketerBO bo) {
		int count = 0;
		count=jt.update(UPDATE_CRICKETERS, bo.getName(),bo.getAge(),bo.getRunsodi(),bo.getRunstest(),bo.getRunst20(),bo.getId());
		return count;
	}
	
	 @Override
	public int deleteCricketer(int no) {
		int count=0;
		count=jt.update(DELETE_CRICKETER, no);
		return count;
	}


}//class
