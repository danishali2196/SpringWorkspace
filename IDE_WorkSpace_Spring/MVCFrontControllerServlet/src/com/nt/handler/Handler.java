package com.nt.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Handler {
	
	public String handel(HttpServletRequest req,HttpServletResponse rep)throws Exception;

}
