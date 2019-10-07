package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Vehicle {
	private String beanid;
	
	public Vehicle() {
		System.out.println("Vehicle.Vehicle()::0-param constructor");
	}

	public String getBeanid() {
		return beanid;
	}

	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}
	
	public void move() {
		DefaultListableBeanFactory factory=new  DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		Engine engine=factory.getBean(beanid,Engine.class);
		engine.start();
		System.out.println("vehicle is moving");
	}
	

}
