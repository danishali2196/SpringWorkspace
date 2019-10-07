package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.bo.EmployeeResultBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.EmployeeResultDTO;

public class EmpSearchServiceImpl implements EmpSearchService {
	EmployeeDAO dao;

	public EmpSearchServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<EmployeeResultDTO> fetchEmployee(EmployeeDTO dto) {
		EmployeeBO bo=null;
		List<EmployeeResultDTO> listRDTO=null;
		List<EmployeeResultBO> listRBO=null;
		System.out.println(dto);
		//convert dto to bo
		bo=new EmployeeBO();
		bo.setEmpNo(dto.getEmpNo());
		bo.setEname(dto.getEname());
		bo.setJob(dto.getJob());
		bo.setSal(dto.getSal());
		System.out.println("bo::"+bo);
		//use dao
		listRBO=dao.getEmployee(bo);
		
		//convert listRBO to listRDTO
		listRDTO=new ArrayList();															///changes required
		for(EmployeeResultBO rbo:listRBO) {
			EmployeeResultDTO rdto=new EmployeeResultDTO();
			BeanUtils.copyProperties(rbo, rdto);
			listRDTO.add(rdto);
		}
		return listRDTO;
	}

}
