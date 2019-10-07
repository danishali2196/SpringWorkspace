package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.bike.Bikes;

public class BikeTest {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Bikes b1=null,b2=null;
		
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//get bean class object
		b1=factory.getBean("rajaBike",Bikes.class);
		System.out.println(b1);
		System.out.println("...................................");
		b2=factory.getBean("asifBike",Bikes.class);
		System.out.println(b2);
		
		
		

	}

}
