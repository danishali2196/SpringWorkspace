package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

public class EmployeeController extends AbstractController {
	EmployeeService service;
	
	public EmployeeController(EmployeeService service) {
		System.out.println("EmployeeController.EmployeeController()");
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView mav=null;
		
		List<EmployeeDTO> listDto=null;
		
		listDto=service.fetchAllEmployee();
		mav=new ModelAndView("show_emp", "empList", listDto);

		return mav;
	}

}
