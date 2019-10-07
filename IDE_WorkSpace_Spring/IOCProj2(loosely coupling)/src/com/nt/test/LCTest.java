package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.FlipKart;

public class LCTest {

	public static void main(String[] args) {
		//create bean factory object to create IOC container
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
	//get bean object
		FlipKart bean=factory.getBean("fpkt", FlipKart.class);
		String billmsg=bean.purchese(new String[] {"paint,books,table"});

		System.out.println(billmsg);
		
	
	
	}

}
