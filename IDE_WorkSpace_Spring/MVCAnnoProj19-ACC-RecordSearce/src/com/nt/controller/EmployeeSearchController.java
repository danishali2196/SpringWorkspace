package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.dto.EmployeeDTO;
import com.nt.dto.EmployeeResultDTO;
import com.nt.service.EmpSearchService;
import com.nt.vo.EmployeeVO;

@Controller("empController")
public class EmployeeSearchController {

	@Autowired
	EmpSearchService service;

	@RequestMapping("/search.htm")
	public String process(Map<String,Object> map,EmployeeVO obj)throws Exception{
		
		//get empVO class object
		EmployeeVO empVo=obj;
		
		//convert vo to dto
		EmployeeDTO dto=new EmployeeDTO();
		System.out.println("VO:::"+empVo);
		dto.setEmpNo(empVo.getEmpNo());
		dto.setEname(empVo.getEname());
		dto.setJob(empVo.getJob());
		dto.setSal(empVo.getSal());
		
		//use service
		List<EmployeeResultDTO> listDTO=service.fetchEmployee(dto);
		
		map.put("searchResult",listDTO);
		return "result";
	}

}
