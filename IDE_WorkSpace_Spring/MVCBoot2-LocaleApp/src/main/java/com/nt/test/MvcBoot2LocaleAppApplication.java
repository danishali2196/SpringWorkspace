package com.nt.test;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.nt.config.MyWebAppConfig;

@SpringBootApplication
@Import(MyWebAppConfig.class)
public class MvcBoot2LocaleAppApplication {

	public static void main(String[] args) {
		System.out.println("MvcBoot2LocaleAppApplication.main()");
		SpringApplication.run(MvcBoot2LocaleAppApplication.class, args);
	}

}
