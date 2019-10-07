package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.nt.command.UserCommand;
import com.nt.dto.UserDTO;
import com.nt.service.LoginService;


@Controller
@SessionAttributes("userCmd")
public class LoginController {
	
	@Autowired
	private LoginService service;
	

	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public String showForm(Map<String,Object> map) {
	
		UserCommand cmd=new UserCommand();
		map.put("userCmd", cmd);
		System.out.println("LoginController.showForm()");
		return "loginForm";
	}
	

	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public String process(Map<String,Object> map,@ModelAttribute("userCmd") UserCommand cmd) {
		System.out.println(cmd);
		System.out.println("LoginController.process()");
		UserDTO dto=null;
		String result;
		
		dto=new UserDTO();
		BeanUtils.copyProperties(cmd, dto);
		
		result=service.verifyUser(dto);
		
		map.put("resultMsg", result);
		
		return "loginForm";
		
	}

}
