package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.UserBO;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {
	private static final String AUTH_USER_QUERY="SELECT COUNT(*) FROM USER_LOGIN WHERE USERNAME=? AND PASSWORD=?";
	
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int authenticationUser(UserBO bo) {
		int count;
		
		count = jt.queryForObject(AUTH_USER_QUERY,Integer.class, bo.getUsername(),bo.getPassword());
		
		
		System.out.println("count::::"+count);
		
		return count;
	}

}
