package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("empService")
public class EmployeeMgmtSeviceImpl implements EmployeeMgmtService {

	@Autowired
	private EmployeeDAO dao;
	
	@Override
	public EmployeeDTO getEmployeeById(int eid) {
		EmployeeBO bo=null;
		EmployeeDTO dto=null;
		//use dao
		bo=dao.getEmployeeById(eid);
		//convert bo to dto
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(bo, dto);
		
		
		return dto;
		
	}

	@Override
	public List<EmployeeDTO> getEmployeeByDesg(String desg) {
		List<EmployeeBO> listBO=null;
	//	EmployeeBO bo=null;
		List<EmployeeDTO> listDTO=new ArrayList<EmployeeDTO>();
	//	EmployeeDTO dto=new EmployeeDTO();
		
		listBO=dao.getEmployeeByDesg(desg);
		System.out.println(listBO);
		
//		BeanUtils.copyProperties(listBO,dto);
//		listDTO.add(dto);
		
		
		for (EmployeeBO  bo:listBO) {
			EmployeeDTO dto=new EmployeeDTO();
			dto.setEid(bo.getEid());
			dto.setEname(bo.getEname());
			dto.setDesg(bo.getDesg());
			dto.setSalary(bo.getSalary());
			listDTO.add(dto);
		}
		
		return listDTO;
	}

	@Override
	public String inserEmployee(EmployeeDTO dto) {
		EmployeeBO bo=null;
		System.out.println(dto);
		bo=new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		
		int count=dao.insertEmployee(bo);
		if (count==1) {
			return "Record INserted";
		}
		else
			return "Record not inserted";
		
	}

}
