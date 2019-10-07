package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.WishService;

public class WishController extends AbstractController {
	
	private WishService service;
	
	public WishController(WishService service) {
		this.service = service;
	}



	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
	
		ModelAndView mov=null;
		//get service class object
		String msg=service.generateWishMessage();
	
		mov=new ModelAndView("result", "wMsg", msg);
		return mov;
	}

}
