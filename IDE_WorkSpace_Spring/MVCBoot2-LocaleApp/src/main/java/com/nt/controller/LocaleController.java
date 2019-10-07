package com.nt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocaleController {
	
	private Locale locales[];
	
	public LocaleController() {
		locales = Locale.getAvailableLocales();
	}
	
	@RequestMapping("/home.htm")
	public String showHome() {
		return "welcome";
	}
	
	@RequestMapping("/country.htm")
	public String getCountries(Map<String,Object> map) {
		
		List<String> countryList =  new ArrayList();
		
		for(Locale loc : locales) {
			countryList.add(loc.getDisplayCountry());
		}
		
		map.put("resultList", countryList);
		
		return "result";
		
	}
	
	@RequestMapping("/lang.htm")
	public String  getLang(Map<String,Object> map ) {
		
		List<String> langList = new ArrayList();
		
		for(Locale loc : locales) {
			langList.add(loc.getDisplayLanguage());
		}
		
		map.put("resultList" , langList);

		return "result";
	}
	

}
