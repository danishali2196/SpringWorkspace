package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.beans.FlipKart;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.beans")
public class SpringBootStrategyDpFlipkartAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		FlipKart fpkt=null;
		
		ctx=SpringApplication.run(SpringBootStrategyDpFlipkartAppApplication.class, args);
		
		fpkt=ctx.getBean("fpkt",FlipKart.class);
		
		System.out.println(fpkt.shopping(new String[]{"jeans","t-shirt","shoes"}));
	}

}
