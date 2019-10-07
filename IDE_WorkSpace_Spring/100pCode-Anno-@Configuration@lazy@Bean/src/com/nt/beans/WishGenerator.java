package com.nt.beans;

import java.util.Calendar;

import javax.annotation.Resource;
import javax.inject.Named;

@Named("wish")
public class WishGenerator {
	@Resource
	 private Calendar calendar=null;
	
	public String wishMessage(String user) {
		int hour=0;
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
