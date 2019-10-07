package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;

	@GetMapping("/stud.htm")
	public String showHome(@ModelAttribute("studCmd") StudentCommand cmd) {
		return "student_form";
	}
	
	@PostMapping("/stud.htm")
	public String saveStud(Map<String, Object> map, @ModelAttribute("studCmd") StudentCommand cmd) {
		
		String result=null;
		StudentDTO dto = new StudentDTO();
		
		BeanUtils.copyProperties(cmd, dto);
		
		result = service.insertData(dto);
		
		map.put("msg", result);
		
		return "student_form";
	}
	
	@RequestMapping("/display.htm")
	public String displayStud(Map<String, Object> map,@ModelAttribute("studCmd") StudentCommand cmd) {
		
		
		StudentDTO dto = null;
		dto = service.retriveStud();
		System.out.println("controller dto::"+dto);
		map.put("display",dto);
		
		return "student_form";
		
	}
}
