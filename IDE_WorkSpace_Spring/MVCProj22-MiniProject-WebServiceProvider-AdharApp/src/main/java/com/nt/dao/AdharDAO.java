package com.nt.dao;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.nt.bo.UserBO;
import com.nt.bo.UserRBO;


public interface AdharDAO {
	
	public int storeRecord(UserBO bo);

	public List<UserRBO> getRecordById(long id);
}
