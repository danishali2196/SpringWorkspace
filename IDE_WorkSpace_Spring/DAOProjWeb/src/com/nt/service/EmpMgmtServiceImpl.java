package com.nt.service;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmpBO;
import com.nt.dao.EmpDAO;
import com.nt.dto.EmpDTO;

@Service("empService")
public class EmpMgmtServiceImpl implements EmpMgmtService {
	
	@Autowired
	private EmpDAO dao;
	
	@Override
	public EmpDTO getEmpByID(int no) throws Exception {
		EmpDTO dto=null;
		EmpBO bo=null;
		
		bo=dao.findEmpById(no);
		
		dto.setEno(bo.getEno());
		dto.setEname(bo.getEname());
		dto.setDesg(bo.getDesg());
		dto.setSalary(bo.getSalary());
		
		
		return dto;
	}

}
