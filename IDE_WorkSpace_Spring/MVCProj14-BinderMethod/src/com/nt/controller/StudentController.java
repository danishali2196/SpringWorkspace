package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.RegistrationCommand;

public class StudentController extends SimpleFormController {
	
//	@Override
//	public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
//		
//		System.out.println("StudentController.initBinder()");
//		
//		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
//		
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
//	}
	
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		System.out.println("StudentController.onSubmit()");
		
		RegistrationCommand cmd=(RegistrationCommand) command;
		
		return new ModelAndView("result","msg",cmd);
		
	}

}
