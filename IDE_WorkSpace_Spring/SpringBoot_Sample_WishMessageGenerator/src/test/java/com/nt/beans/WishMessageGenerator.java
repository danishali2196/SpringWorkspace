package com.nt.beans;

import java.util.Calendar;

import org.springframework.stereotype.Component;

@Component("wish")
public class WishMessageGenerator {
	
	public String wishMessageGenerator(String user) {
		int hour=0;
		Calendar calendar=null;
		
		calendar=Calendar.getInstance();
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		
		if(hour<12) {
			return "Good Morning::"+user;
		}
		else if(hour<16) {
			return "Good Afternoon::"+user;
		}
		else if(hour<20) {
			return "Good Evening::"+user;
		}
		else {
			return "Food Night::"+user;
		}
	}

}
