package com.nt.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VotingElgibility;

public class ElgibityTest {

	public static void main(String[] args) {

		ApplicationContext ctx=null;
		VotingElgibility ve=null;
		
		//create applicationContext container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		ve=ctx.getBean("voter",VotingElgibility.class);
		System.out.println(ve.checkElgibility());
		
		((AbstractApplicationContext) ctx).close();

	}

}
