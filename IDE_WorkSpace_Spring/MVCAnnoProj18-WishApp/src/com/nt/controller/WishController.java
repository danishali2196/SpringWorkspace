package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.WishMsgService;

@Controller
public class WishController {
	@Autowired
	private WishMsgService service;
	
	@RequestMapping("/wish.htm")
	public ModelAndView process() {
		String msg=null;
		
		msg= service.wishMsgGenerator("Danish");
		
		return new ModelAndView("result", "wMsg", msg);
		
		
	}
		
	
}

