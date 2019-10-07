package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.UserCommand;
import com.nt.dto.UserDTO;
import com.nt.dto.UserRDTO;
import com.nt.service.AdharMgmtService;

@Controller
public class AdharController {

	@Autowired
	private AdharMgmtService service;
	
	
//	public  Map referenceData(@ModelAttribute("userCmd") UserCommand cmd) {
//		Map<String,List<String>> map = new HashMap();
//		List<String> gender = new ArrayList();
//		
//		gender.add("male");
//		gender.add("female");
//		
//		map.put("genderType", gender);
//		return map;
//	}
	
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		System.out.println("AdharController.initBinder()");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf,true));
		
	}

	@RequestMapping(value="/reg.htm", method=RequestMethod.GET)
	public String showForm(Map<String,Object> map) {
		UserCommand cmd=new UserCommand();
		map.put("userCmd", cmd);
		System.out.println("AdharController.showForm()");
		return "adharReg";
	}
	
	@RequestMapping(value="/reg.htm", method=RequestMethod.POST)
	public String process(Map<String,Object> map,@ModelAttribute("userCmd") UserCommand cmd) {
		String msg= null;
		UserDTO dto =null;
		
		dto = new UserDTO();
		BeanUtils.copyProperties(cmd, dto);
		
		msg = service.insertRecord(dto);
		
		map.put("successMsg", msg);
		
		return "success";
	}
	
	@RequestMapping(value="/fetch.htm")
	public String getSingleRecord() {
		List<UserRDTO> listRdto =null;
		Map<String,Object> map = new HashMap();
		UserCommand cmd = null;
		
		listRdto = service.fetchRecord(1);
		System.out.println("Controller"+listRdto);
		
		map.put("userList",listRdto);
		
		return "displayRecord";
	}


}

