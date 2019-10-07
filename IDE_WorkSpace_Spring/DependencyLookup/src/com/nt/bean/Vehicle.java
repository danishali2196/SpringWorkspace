package com.nt.bean;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.env.SystemEnvironmentPropertySource;

public class Vehicle {
	private String beanid; 
	
	public Vehicle() {
		System.out.println("Vehicle.Vehicle()::0-param Constructor");
	}
	
	public void setBeanid(String beanid) {
		this.beanid=beanid;
	}
	
	public void move() {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		Engine engine=factory.getBean(beanid,Engine.class);
		engine.start();
		System.out.println("vehicle move for journey");
		
	}
	

}
