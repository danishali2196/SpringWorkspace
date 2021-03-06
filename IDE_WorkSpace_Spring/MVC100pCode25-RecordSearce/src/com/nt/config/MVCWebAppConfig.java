package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.nt.controller")
public class MVCWebAppConfig {
	
	@Bean
	public InternalResourceViewResolver createIrvr() {
		
		InternalResourceViewResolver irvr = null;
		irvr = new InternalResourceViewResolver();
		
		irvr.setPrefix("/WEB-INF/pages/");
		irvr.setSuffix(".jsp");
		return irvr;
	}

}
