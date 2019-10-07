package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmpBO;
import com.nt.dao.EmpDAO;
import com.nt.dto.EmpDTO;
@Service("empService")
public class EmpServiceImpl implements EmpService {
	@Autowired(required=true)
	private EmpDAO dao;
	
//	public EmpServiceImpl(EmpDAO dao) {
//		this.dao = dao;
//	}


	@Override
	public List<EmpDTO> findEmpByDesg(String desg) throws Exception {
		List<EmpBO> listBO=null;
		List<EmpDTO> listDTO=null;
		EmpDTO dto=null;
		
		//use dao
		listBO=dao.searchEmpByDesg(desg);
		//convert listBO to listDTO
		listDTO=new ArrayList();
		for (EmpBO empBO : listBO) {
			//copy each bo to each dto class obj
			dto=new EmpDTO();
			//BeanUtils.copyProperties(empBO, dto);
			dto.setEno(empBO.getEmpno());
			dto.setEname(empBO.getEname());
			dto.setDesg(empBO.getDesg());
			dto.setSalary(empBO.getSalary());
			
			dto.setSrNo(listDTO.size()+1);
			listDTO.add(dto);
		}//for each
		
		
		return listDTO;
	}//method

}//class
