package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.DBOperation;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		DBOperation db=null;
		
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		db=ctx.getBean("dbo", DBOperation.class);
		
		System.out.println(db);
		
((AbstractApplicationContext) ctx).close();
	}

}
