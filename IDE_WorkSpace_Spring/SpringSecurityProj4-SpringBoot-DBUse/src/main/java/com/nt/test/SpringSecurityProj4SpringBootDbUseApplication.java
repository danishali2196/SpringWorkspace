package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.nt.config.RootAppConfig;
import com.nt.config.WebAppConfig;

@SpringBootApplication
@Import({RootAppConfig.class,WebAppConfig.class})
public class SpringSecurityProj4SpringBootDbUseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityProj4SpringBootDbUseApplication.class, args);
	}

}
