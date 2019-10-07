package com.nt.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.nt.dto.UserDTO;
import com.nt.dto.UserRDTO;


@WebService(serviceName="Adhar")
public interface AdharMgmtService {
	
	@WebMethod(exclude=true)
	public String insertRecord(UserDTO dto);

	@WebMethod
	public @WebResult List<UserRDTO> fetchRecord(@WebParam long id);

}
