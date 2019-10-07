package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDAO dao;
	
	public EmployeeServiceImpl(EmployeeDAO dao) {
		System.out.println("EmployeeServiceImpl.EmployeeServiceImpl()");
		this.dao = dao;
	}

	@Override
	public List<EmployeeDTO> fetchAllEmployee() throws Exception {
		System.out.println("EmployeeServiceImpl.fetchAllEmployee()");
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=null;
		EmployeeDTO dto=null;


		listBO=dao.getEmployee();
		listDTO=new ArrayList();
		for (EmployeeBO bo : listBO) {
			dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		}
		
		
		return listDTO;
	}

}
