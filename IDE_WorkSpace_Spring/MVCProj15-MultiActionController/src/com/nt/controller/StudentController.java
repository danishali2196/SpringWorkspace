package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nt.command.StudentCommand;

public class StudentController extends MultiActionController {
	
	public ModelAndView insert(HttpServletRequest req, HttpServletResponse res,StudentCommand cmd) {
		System.out.println("StudentController.add()");
		return new ModelAndView("welcome", "msg",cmd);
		
	}
	public ModelAndView edit(HttpServletRequest req, HttpServletResponse res,StudentCommand cmd) {		
		System.out.println("StudentController.edit()");
		return new ModelAndView("welcome", "msg",cmd);
	}
	public ModelAndView delete(HttpServletRequest req, HttpServletResponse res,StudentCommand cmd) {
		System.out.println("StudentController.delete()");
		return new ModelAndView("welcome","msg",cmd);
		
	}
	public ModelAndView show(HttpServletRequest req, HttpServletResponse res,StudentCommand cmd) {
		System.out.println("StudentController.show()");
		return new ModelAndView("welcome", "msg", cmd);
		
	}
	
	public ModelAndView invalid(HttpServletRequest req, HttpServletResponse res,StudentCommand cmd) {

		return new ModelAndView("welcome", "cmd", "invalid Operation");
		
	}

}
