package com.nt.test;



import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A_setterInje;

public class ClientTest {
	
	public static void main(String[] args) {
		
		System.out.println("danish ali");
		
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		A_setterInje a=null;
		
		factory=new DefaultListableBeanFactory();
		
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		a = factory.getBean("a",A_setterInje.class);
		
		
	}

}
