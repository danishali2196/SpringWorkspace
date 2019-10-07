package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		Calendar cal=null;
		int hour=0;
		String msg=null;
		ModelAndView mov=null;
		//get calender
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		
		if (hour<=12) {
			msg="Good Morning";
		}
		else if (hour<=16) {
			msg="good Afternoon";
		}
		else if (hour<=20) {
			msg="good evening";
		}
		else {
			msg="good night";
		}
		
		mov=new ModelAndView("result", "wMsg", msg);
		return mov;
	}

}
