package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.nt.command.MetromonyCommand;

public class MetromonyController extends AbstractWizardFormController {

	@Override
	public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
		System.out.println("MetromonyController.initBinder()");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf,true));
	}
	
	
	@Override
	public Map referenceData(HttpServletRequest request, int page) throws Exception {
		Map<String,List<String>> map=null;
		List<String> gender=null;
		List<String> hobies=null;
		
		System.out.println("MetromonyController.referenceData()");
		
		gender=new ArrayList();
		gender.add("Male");
		gender.add("FeMale");
		
		hobies=new ArrayList();
		hobies.add("Sleeping");
		hobies.add("eating");
		hobies.add("traveling");
		hobies.add("shopping");
		
		map=new HashMap();
		map.put("genderList", gender);
		map.put("hobiesList", hobies);
		
		return map;
	}
	
	
	@Override
	protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
			System.out.println("MetromonyController.processCancel()");
			return new ModelAndView("welcome");
		}
	
	
	@Override
	protected ModelAndView processFinish(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException be) throws Exception {
			System.out.println("MetromonyController.processFinish()");
		MetromonyCommand cmd=(MetromonyCommand) command; 
		
		
		return new ModelAndView("result", "cmdData",cmd);
	}

}
