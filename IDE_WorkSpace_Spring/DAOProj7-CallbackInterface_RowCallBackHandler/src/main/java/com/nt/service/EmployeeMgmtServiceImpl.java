package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dao.EmployeeDAOImpl;
import com.nt.dto.EmployeeDTO;

@Service("empService")
public class EmployeeMgmtServiceImpl implements EmployeeMgmtService {

	@Autowired
	public EmployeeDAO dao;


	@Override
	public List<EmployeeDTO> findEmpBySalRange(int startSal, int endSal) {
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=new ArrayList();
		
		listBO=dao.searchEmpBySalRange(startSal, endSal);
		listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			 BeanUtils.copyProperties(bo, dto);
			 listDTO.add(dto);
		});
	 return listDTO;

	}
	

}
