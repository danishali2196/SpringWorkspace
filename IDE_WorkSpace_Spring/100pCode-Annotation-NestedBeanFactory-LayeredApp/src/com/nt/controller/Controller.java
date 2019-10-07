package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.nt.dto.EmpDTO;
import com.nt.service.EmpService;
import com.nt.vo.EmpVO;

@Component("controller")
@Lazy
public class Controller {
	@Autowired
	private EmpService service;


	public List<EmpVO> getEmpsByDesg(String desg)throws Exception{
		List<EmpVO> listVO=null;
		List<EmpDTO> listDTO=null;
		
		EmpVO vo=null;
		//use service
		listDTO=service.findEmpByDesg(desg);
		//convert listDTO to listVo
		listVO=new ArrayList();
		for (EmpDTO empDTO : listDTO) {
			//copy each dto class to vo class object
			vo=new EmpVO();
			vo.setEno(String.valueOf(empDTO.getEno()));
			vo.setEname(empDTO.getEname());
			vo.setDesg(empDTO.getDesg());
			vo.setSalary(String.valueOf(empDTO.getSalary()));
			vo.setSrNo(String.valueOf(empDTO.getSrNo()));
			
			listVO.add(vo);
		}
		return listVO;
	}
	
	

}
