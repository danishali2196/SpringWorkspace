package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.WishGenerator;
import com.nt.config.BeanConfigurator;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishGenerator wg=null;
		
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(BeanConfigurator.class);
		
		//get bean class object
		wg=ctx.getBean("wish",WishGenerator.class);

		//invoke the method
		System.out.println(wg.wishMessage("Danish"));
		
		((AbstractApplicationContext) ctx).close();
	}

}
