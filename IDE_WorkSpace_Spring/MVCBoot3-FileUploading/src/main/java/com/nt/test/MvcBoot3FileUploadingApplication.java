package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.nt.config.WebMvcAppConfig;

@SpringBootApplication
@Import(WebMvcAppConfig.class)
public class MvcBoot3FileUploadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcBoot3FileUploadingApplication.class, args);
	}

}
