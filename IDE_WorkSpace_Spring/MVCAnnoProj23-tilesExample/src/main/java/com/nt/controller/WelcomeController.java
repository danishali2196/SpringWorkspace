package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	@RequestMapping(name="/welcome.htm")
	public String homePage() {
		return "welcomePage";
	}
	
	@RequestMapping(name="/faculties.htm")
	public String facultyPage() {
		return "facultiesPage";
	}

	@RequestMapping(name="/address.htm")
	public String addressPage() {
		return "addressPage";
	}

	@RequestMapping(name="/courses.htm")
	public String coursesPage() {
		return "coursesPage";
	}

}
