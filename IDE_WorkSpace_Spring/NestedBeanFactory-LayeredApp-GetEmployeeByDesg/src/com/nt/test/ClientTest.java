package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.Controller;
import com.nt.vo.EmpVO;

public class ClientTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader1=null,reader2=null;
		Controller c1=null;
		List<EmpVO> listVO=null;
		
		factory=new DefaultListableBeanFactory();
		reader1=new XmlBeanDefinitionReader(factory);
		reader1.loadBeanDefinitions("com/nt/cfgs/presentation-beans.xml");
		
		reader2=new XmlBeanDefinitionReader(factory);
		reader2.loadBeanDefinitions("com/nt/cfgs/bussines-beans.xml");
		
		c1=factory.getBean("controller",Controller.class);
		
		try {
			listVO=c1.getEmpsByDesg("CLERK");
			//display 
			for (EmpVO vo : listVO) {
				System.out.println(vo.toString());
			}
			
		} catch (Exception e) {
			System.out.println("Internal Problem");
		}

	}

}
