package com.nt.handler;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowDateHandler implements Handler {

	@Override
	public String handel(HttpServletRequest req, HttpServletResponse rep) throws Exception {
		Date d=null;
		//get date class object
		d=new Date();
		req.setAttribute("sysDate", d);
		return "sh_date";
	}

}
