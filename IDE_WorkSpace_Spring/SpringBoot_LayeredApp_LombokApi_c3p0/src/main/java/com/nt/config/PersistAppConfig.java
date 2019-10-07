package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistAppConfig {
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource createDS() throws Exception {
		ComboPooledDataSource cpds=null;
		cpds=new ComboPooledDataSource();
		cpds.setDriverClass(env.getProperty("spring.datasource.driver-class-name"));
		cpds.setJdbcUrl(env.getProperty("spring.datasource.url"));
		cpds.setUser(env.getProperty("spring.datasource.username"));
		cpds.setPassword(env.getProperty("spring.datasource.password"));
		
		return cpds;
		
		
	}
	

}
