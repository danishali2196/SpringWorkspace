package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.CricketerDTO;
import com.nt.service.CricService;

public class CricketerController extends AbstractController {
	private CricService service;
	
	public CricketerController(CricService service) {
		System.out.println("CricketerController.CricketerController()");
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<CricketerDTO> listDTO=null;
		
		listDTO=service.fatchAllCricketer();
	
		return new ModelAndView("report_show", "listDTO",listDTO);
	}

}
