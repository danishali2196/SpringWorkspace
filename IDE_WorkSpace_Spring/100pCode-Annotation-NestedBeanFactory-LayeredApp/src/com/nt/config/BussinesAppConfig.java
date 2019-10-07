package com.nt.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.nt.dao","com.nt.service"})
@PropertySource("classpath:com/nt/commans/jdbcInfo.properties")
public class BussinesAppConfig {
	
	@Value("${jdbc.driver_class}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.user}")
	private String user;
	@Value("${jdbc.password}")
	private String password;
	
	@Bean(name="ds")
	public BasicDataSource ds(){
		BasicDataSource bds=new BasicDataSource();
		bds. setDriverClassName(driver);
		bds.setUrl(url);
		bds.setUsername(user);
		bds.setPassword(password);
		
		return bds;
	}
	

}
