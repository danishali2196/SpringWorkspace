package com.nt.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ShowHomeView implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Date d=null;
		ModelAndView mav=null;
		//get Date class object
		d=new Date();
		//get modelAndView object
		mav=new ModelAndView("home", "sysDate", d);
		return mav;
	}

}
