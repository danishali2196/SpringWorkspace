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

public class ClientApp {

	public static void main(String[] args) {
//			ApplicationContext ctx=null;
//			IntrAmtCalculator iac=null;
//			//create IOc container 
//			ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
//			//get bean class object
//			iac=ctx.getBean("iac",IntrAmtCalculator.class);
//			System.out.println(iac.calcIntrAmt());
		
				DefaultListableBeanFactory factory=null;
				XmlBeanDefinitionReader reader =null;
				IntrAmtCalculator iac=null;
				
				factory = new DefaultListableBeanFactory();
				reader = new XmlBeanDefinitionReader(factory);
				reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
				
				factory.addPropertyEditorRegistrar(new MyCustomPE()); 
			
				iac=factory.getBean("iac" , IntrAmtCalculator.class);
						System.out.println(iac.calcIntrAmt());
	}
	
}
					class MyCustomPE implements PropertyEditorRegistrar{
					@Override
					public void registerCustomEditors(PropertyEditorRegistry registry) {
						registry.registerCustomEditor(IntrAmtDetails.class, new CustomIntramtEditor());
						
					}
					

}
