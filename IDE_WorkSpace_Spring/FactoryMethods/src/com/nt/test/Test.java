package com.nt.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Class c1=null;
		Calendar c2=null;
		String s1=null,s2=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		c1=factory.getBean("c1",Class.class);
		System.out.println("c1 data::"+c1+" c1 class::"+c1.getClass());
		c2=factory.getBean("c2",Calendar.class);
		System.out.println("c2 data::"+c2+" c2 class::"+c2.getClass());
		
		s1=factory.getBean("s1",String.class);
		System.out.println("s1 data::"+s1+" s1 class::"+s1.getClass());
		
		s2=factory.getBean("s2",String.class);
		System.out.println("s2 data::"+s2+" s2 class::"+s2.getClass());
	}

}
