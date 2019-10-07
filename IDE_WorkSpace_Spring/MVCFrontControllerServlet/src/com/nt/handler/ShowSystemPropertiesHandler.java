package com.nt.handler;

import java.util.Date;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowSystemPropertiesHandler implements Handler {

	@Override
	public String handel(HttpServletRequest req, HttpServletResponse rep) throws Exception {
		Properties props=null;
		//get date class object
		props=System.getProperties();
		req.setAttribute("sysProps", props);
		return "sh_props";
	}

}
