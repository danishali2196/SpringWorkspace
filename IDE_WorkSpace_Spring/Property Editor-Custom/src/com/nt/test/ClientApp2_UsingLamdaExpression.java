package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.IntrAmtCalculator;
import com.nt.beans.IntrAmtDetails;
import com.nt.property.CustomIntramtEditor;

public class ClientApp2_UsingLamdaExpression {

	public static void main(String[] args) {

				DefaultListableBeanFactory factory=null;
				XmlBeanDefinitionReader reader =null;
				IntrAmtCalculator iac=null;
				
				factory = new DefaultListableBeanFactory();
				reader = new XmlBeanDefinitionReader(factory);
				reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
				
				factory.addPropertyEditorRegistrar(registry ->{
						registry.registerCustomEditor(IntrAmtDetails.class, new CustomIntramtEditor());
					}
			);
						
				iac=factory.getBean("iac" , IntrAmtCalculator.class);
						System.out.println(iac.calcIntrAmt());
	}
	
}
				
				
						
		
