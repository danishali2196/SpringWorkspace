package com.nt.dao;

import com.nt.bo.UserBO;

public interface LoginDAO {
	
	public int authenticationUser(UserBO bo);

}
