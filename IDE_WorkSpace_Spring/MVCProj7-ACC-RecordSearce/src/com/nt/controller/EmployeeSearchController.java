package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.nt.dto.EmployeeDTO;
import com.nt.dto.EmployeeResultDTO;
import com.nt.service.EmpSearchService;
import com.nt.vo.EmployeeVO;

public class EmployeeSearchController extends AbstractCommandController {
	EmpSearchService service;
	
	
	public EmployeeSearchController(EmpSearchService service) {
		this.service = service;
	}


	@Override
	public ModelAndView handle(HttpServletRequest req, HttpServletResponse res, Object obj, BindException be)
			throws Exception {
		
		//get empVO class object
		EmployeeVO empVo=(EmployeeVO) obj;
		
		//convert vo to dto
		EmployeeDTO dto=new EmployeeDTO();
		System.out.println("VO:::"+empVo);
		dto.setEmpNo(empVo.getEmpNo());
		dto.setEname(empVo.getEname());
		dto.setJob(empVo.getJob());
		dto.setSal(empVo.getSal());
		
		//use service
		List<EmployeeResultDTO> listDTO=service.fetchEmployee(dto);
		
		
		return new ModelAndView("result", "searchResult", listDTO);
	}

}
