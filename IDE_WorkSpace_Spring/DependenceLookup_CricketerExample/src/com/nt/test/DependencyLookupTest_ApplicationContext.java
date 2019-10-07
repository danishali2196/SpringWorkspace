package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class DependencyLookupTest_ApplicationContext {

	public static void main(String[] args) {
		System.out.println("DependencyLookupTest_ApplicationContext.main()::0 param constructor");
		ApplicationContext ctx=null;
		Cricketer ck=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		ck=ctx.getBean("cric",Cricketer.class);
		ck.start();
		ck.play();
		ck.end();
		
		((AbstractApplicationContext) ctx).close();
	}

}
