package com.nt.service;

import java.util.Calendar;

import org.springframework.web.servlet.ModelAndView;

public class WishServiceImpl implements WishService {

	@Override
	public String generateWishMessage() {
		
		
		Calendar cal=null;
		int hour=0;
	
		//get calender
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		
		if (hour<=12) {
			return "Good Morning";
		}
		else if (hour<=16) {
			return "good Afternoon";
		}
		else if (hour<=20) {
			return "good evening";
		}
		else {
			return "good night";
		}
		
	}

}
