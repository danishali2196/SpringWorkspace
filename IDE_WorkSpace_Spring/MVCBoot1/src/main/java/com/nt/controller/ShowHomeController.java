package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {
	
	@RequestMapping(value="/home.htm")
	public String showHomePage() {
		System.out.println("ShowHomeController.showHomePage()");
		return "welcome";
	}

}
