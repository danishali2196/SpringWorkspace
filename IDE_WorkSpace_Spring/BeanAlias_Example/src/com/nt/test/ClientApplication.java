package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Vehicle;

public class ClientApplication {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Vehicle v1=null; 
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		v1=factory.getBean("vehicle",Vehicle.class);
		v1.move();
	}

}
