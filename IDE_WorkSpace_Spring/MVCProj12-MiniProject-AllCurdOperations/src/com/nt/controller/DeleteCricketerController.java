package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.dto.CricketerDTO;
import com.nt.service.CricService;

public class DeleteCricketerController extends AbstractController {
	private CricService service;
	
	public DeleteCricketerController(CricService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse arg1) throws Exception {
		int no=Integer.parseInt(request.getParameter("id"));
		
		String msg=service.removeCricketer(no);
		
		return new ModelAndView("result", "msg", msg);
	}
	

	

}
