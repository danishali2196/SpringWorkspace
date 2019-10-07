package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO dao;
	
	public CustomerServiceImpl(CustomerDAO dao) {
		this.dao = dao;
	}

	@Override
	public String register(CustomerDTO dto) {
		int count=0;
		CustomerBO bo=null;
		//convert DTO to BO
		bo=new CustomerBO();
		BeanUtils.copyProperties(dto, bo);
		
		//use dao
		count=dao.loadCustomer(bo);
		
		if (count == 0) {
			return "Registration Failed";
		}
		else {
			return "Registration Succeded";
		}
		
	}

}
