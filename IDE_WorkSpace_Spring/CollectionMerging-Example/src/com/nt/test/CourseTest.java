package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.bean.EnggCourse;

public class CourseTest {

	public static void main(String[] args) {
		EnggCourse s1=null,s2=null;
		
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		s1=factory.getBean("1stCse",EnggCourse.class);
		System.out.println(s1);
		System.out.println("............................");
		s2=factory.getBean("1stEc",EnggCourse.class);
		System.out.println(s2);
		
	}

}
