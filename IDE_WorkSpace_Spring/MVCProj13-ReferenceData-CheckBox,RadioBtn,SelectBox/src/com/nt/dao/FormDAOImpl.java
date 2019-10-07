package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;


import com.nt.bo.FormBO;

public class FormDAOImpl implements FormDAO {
	private static final String GET_ALL_COUNTRIES="SELECT COUNTRY FROM COUNTRIES";
	private static final String GET_ALL_GENDER="SELECT GENDERTYPE FROM GENDER";

	private JdbcTemplate jt;
	
	public FormDAOImpl(JdbcTemplate jt) {
		System.out.println("FormDAOImpl.FormDAOImpl()");
		this.jt = jt;
	}

	@Override
	public List<FormBO> getCountry() {
		List<FormBO> listBO=null;
		
		listBO=jt.query(GET_ALL_COUNTRIES, new ResultSetExtractor<List<FormBO>>(){

			@Override
			public List<FormBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				List<FormBO> listBo=new ArrayList();
				while(rs.next()) {
					FormBO bo=new FormBO();
					bo.setCountry(rs.getString(1));
					listBo.add(bo);
				}
				
				return listBo;
			}
			
		});
		System.out.println(listBO);
		return listBO;
	}

	@Override
	public List<FormBO> getGender() {
		List<FormBO> listBO=null;
		
		listBO=jt.query(GET_ALL_GENDER, new ResultSetExtractor<List<FormBO>>() {

			@Override
			public List<FormBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<FormBO> listBO1=new ArrayList();
				while(rs.next()) {
					FormBO bo=new FormBO();
					bo.setGender(rs.getString(1));
					listBO1.add(bo);
				}
				return listBO1;
			}});
		
		return listBO;
	}

		
	

}
