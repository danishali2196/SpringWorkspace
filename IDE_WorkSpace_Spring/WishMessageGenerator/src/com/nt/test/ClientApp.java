package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishGenerator;

public class ClientApp {

	public static void main(String[] args) {
		System.out.println("client App:main(-)");
		//locate Spring bean Configuration file
		Resource res=new FileSystemResource("src/com/nt/cfgs/applixcationContext.xml");
		//Activate bean factory container
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//get bean class object
		//WishGenerator bean=(WishGenerator) factory.getBean("wmg");
		WishGenerator bean=factory.getBean("wmg",WishGenerator.class);
		//call business logic
		String result=bean.generatorWissMsg();
		System.out.println(result);
	}

}
