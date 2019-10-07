package com.nt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.FormCommand;
import com.nt.dto.FormDTO;
import com.nt.service.FormService;

public class FormController extends SimpleFormController {
	
	private FormService service;
	
	public FormController(FormService service) {
		this.service = service;
	}

	@Override
	public Map referenceData(HttpServletRequest req, Object cmd, Errors errors) throws Exception {
		List<FormDTO> listDTO=null;
		List<FormDTO> listDTO1=null;
		Map<String,List<String>> map=new HashMap();
		List<String> country=new ArrayList();
		List<String> gender=new ArrayList();
		List<String> hobbie=new ArrayList();
		List<String> product=new ArrayList();
		
//		country.add("India");
//		country.add("USA");
//		country.add("England");
//		country.add("Canada");
		
		
		listDTO=service.getAllCountries();
	
		for (FormDTO dto: listDTO) {
			System.out.println("=============="+dto.getCountry());
			country.add(dto.getCountry());
			map.put("country",country);
		
		}
		
		
		listDTO1=service.getAllGenders();
		for (FormDTO dto:listDTO1){
			System.out.println("================gender==="+dto.getGender());
			gender.add(dto.getGender());
			map.put("gender", gender);
		}
		
		
		hobbie.add("Cricket");
		hobbie.add("Sleeping");
		hobbie.add("Reading");
		
		product.add("Books");
		product.add("Pen");
		product.add("Beg");
		product.add("Shoe");
		
		map.put("hobbieList", hobbie);
		map.put("prodList", product);
		
		return map;
	}
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		

		
		FormCommand cmd=(FormCommand) command;
	 System.out.println(cmd);
		return new ModelAndView("result","list",cmd);
	}

}
