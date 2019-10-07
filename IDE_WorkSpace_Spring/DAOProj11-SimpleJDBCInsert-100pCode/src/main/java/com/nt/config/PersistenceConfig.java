package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan("com.nt.dao")
public class PersistenceConfig {
	
	@Bean
	public DataSource ds() {
		HikariDataSource hkDS=null;
		hkDS=new  HikariDataSource();
		hkDS.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hkDS.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		hkDS.setUsername("system");
		hkDS.setPassword("manager");
		
		return hkDS;
	}
	
	@Bean
	public SimpleJdbcInsert createSJI() {
		SimpleJdbcInsert sji=null;
		sji=new  SimpleJdbcInsert(ds());
		return sji;
	}

}
