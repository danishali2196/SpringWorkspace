package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource ds;
	

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("SecurityConfig.configure()");
		auth.jdbcAuthentication().dataSource(ds).usersByUsernameQuery("select uname,pwd,status from users where uname=?")
		.authoritiesByUsernameQuery("select rollId,rollname,uname from roll_user where uname=?");
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		System.out.println("SecurityConfig.configure()");
		http.authorizeRequests().antMatchers("/home.htm").access("permitAll")
		.antMatchers("/status.htm").access("hasRole('ROLE_PASSENGER')")
		.and()
		.formLogin()
		.and()
		.csrf().disable()
		.logout().logoutUrl("index.jsp")
		.and()
		.exceptionHandling();
	}

}
