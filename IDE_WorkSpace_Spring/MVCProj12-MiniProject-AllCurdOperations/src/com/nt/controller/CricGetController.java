package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.CricketerDTO;
import com.nt.service.CricService;

public class CricGetController extends AbstractController {
	CricService service;

	public CricGetController(CricService service) {
		this.service = service;
	}



	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView mav=null;
		
		List<CricketerDTO> listDto=null;
		
		listDto=service.fetchAllCricketer();
		mav=new ModelAndView("show_cric", "cricList", listDto);

		return mav;
	}

}
