package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RailwayController {
	
	@RequestMapping("/home.htm")
	private String showHome() {
		return "welcome";
	}
	
	@RequestMapping("/status.htm")
	private String trainStatus(Map<String,Object> map,@RequestParam("tno")String tno) {
		
		int no = Integer.parseInt(tno);
		String RailStatus = null;
		
		if(no == 1234) {
			RailStatus = "Trains no "+no+" is delayed in  "+(int)(Math.random()*24)+"  hours";
		}
		
		else if(no == 2345) {
			RailStatus = "Trains no "+no+" is delayed in  "+(int)(Math.random()*24)+"  hours";
		}
		
		else if(no == 3456) {
			RailStatus = "Trains no "+no+" is delayed in  "+(int)(Math.random()*24)+"  hours";
		}
		
		map.put("statusMsg", RailStatus);
		
		return "check_form";
		
	}
	
	

}
