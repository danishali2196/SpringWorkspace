package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.beans.WishMessageGenerator;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.beans")
public class SpringBootSampleWishMessageGeneratorApplicationTests {
			public static void main(String[] args) {
				ApplicationContext ctx=null;
				WishMessageGenerator wmg=null;
				
				ctx=SpringApplication.run(SpringBootSampleWishMessageGeneratorApplicationTests.class, args);
				wmg=ctx.getBean("wish",WishMessageGenerator.class);
				
				System.out.println(wmg.wishMessageGenerator("danish"));
				
			}
	

}
