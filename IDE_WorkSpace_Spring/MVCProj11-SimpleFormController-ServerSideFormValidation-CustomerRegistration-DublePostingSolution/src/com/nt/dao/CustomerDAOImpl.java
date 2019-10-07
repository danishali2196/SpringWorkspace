package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.CustomerBO;

public class CustomerDAOImpl implements CustomerDAO {
	private static final String INSERT_QUERY="INSERT INTO CUSTOMER_REGISTRATION VALUES(CUSTNO_SEQ.NEXTVAL,?,?,?,?)";
	
	private JdbcTemplate jt;

	public CustomerDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int loadCustomer(CustomerBO bo) {
		int count=0;
		count=jt.update(INSERT_QUERY, bo.getCname(),bo.getCaddrs(),bo.getMobileNo(),bo.getBillAmt());
		return count;
	}

}
