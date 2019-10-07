package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.UserBO;
import com.nt.dao.LoginDAO;
import com.nt.dto.UserDTO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDAO dao;

	@Override
	public String verifyUser(UserDTO dto) {
		
		UserBO bo=null;
		String msg=null;
		
		bo = new UserBO();
		BeanUtils.copyProperties(dto, bo);
		
		
		msg=dao.authenticationUser(bo)==1?"velid credential":"invalid credential";

		
		return msg;
	}

}
