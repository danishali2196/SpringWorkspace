package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("wish")
public class WishMsgServiceImpl implements WishMsgService {

	@Override
	public String wishMsgGenerator(String user) {
		Calendar cal = Calendar.getInstance();
		int hour = 0;
		String msg=null;
		
		hour=cal.get(Calendar.HOUR_OF_DAY);
		
		if (hour < 12) {
			msg="Good Morning ::"+user;
		}
		else if(hour<16) {
			msg="Good Afternoon ::"+user;
		}
		else if(hour<20) {
			msg="Good Evening ::"+user;
		}
		else {
			msg="Good Night ::"+user;
		}
		
		
		
		return msg;
	}

}
