package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.vibur.dbcp.ViburDBCPDataSource;


@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistAppConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource createDS() throws Exception {
		ViburDBCPDataSource vibur=null;
		vibur=new ViburDBCPDataSource();
		vibur.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		vibur.setJdbcUrl(env.getProperty("spring.datasource.url"));
		vibur.setUsername(env.getProperty("spring.datasource.username"));
		vibur.setPassword(env.getProperty("spring.datasource.password"));
		
		return vibur;

	}
}
