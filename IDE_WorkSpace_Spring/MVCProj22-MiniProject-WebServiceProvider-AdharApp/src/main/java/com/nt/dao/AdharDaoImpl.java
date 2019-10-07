package com.nt.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.UserBO;
import com.nt.bo.UserRBO;

@Repository("adharDao")
public class AdharDaoImpl implements AdharDAO {
	//private static final String GET_RECORD_BY_ID="SELECT ADHARID,NAME,DOB,GENDER,ADDRS,MOBILE FROM ADHAR_DETAILS WHERE ADHARID=?";
	private static final String GET_RECORD_BY_ID="FROM UserRBO WHERE ADHARID=:id";
	
	
						//	Spring ORM  //
	@Autowired
	private HibernateTemplate ht;
	

	@Override
	public int storeRecord(UserBO bo) {
		int count = 0;
		System.out.println("AdharDaoImpl.storeRecord()");
		count =(int)ht.save(bo);
		
		System.out.println(count);
		return count;
	}

	@Override
	public List<UserRBO> getRecordById(long id) {
		System.out.println(id);
		List<UserRBO> listRbo = new ArrayList();
		System.out.println("AdharDaoImpl.getRecordById()");
		listRbo = (List<UserRBO>) ht.findByNamedParam(GET_RECORD_BY_ID, "id", id);
		System.out.println(listRbo);
		return listRbo;
	}

}
