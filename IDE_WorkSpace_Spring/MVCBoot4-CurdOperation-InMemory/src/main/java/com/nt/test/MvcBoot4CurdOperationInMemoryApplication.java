package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.nt.config.MyWebMvcConfig;

@SpringBootApplication
@Configuration
@Import(MyWebMvcConfig.class)
public class MvcBoot4CurdOperationInMemoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcBoot4CurdOperationInMemoryApplication.class, args);
	}

}
