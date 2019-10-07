package com.nt.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("dbo")
public class DBOperation {
	
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.user}")
	private String user;
	@Value("${jdbc.pwd}")
	private String password;
	@Override
	public String toString() {
		return "DBOperation [driver=" + driver + ", url=" + url + ", user=" + user + ", password=" + password + "]";
		
		
	}
	
	

}
