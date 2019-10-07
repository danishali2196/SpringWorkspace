package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.nt.config.BussinesAppConfig;
import com.nt.config.PresentationAppConfig;
import com.nt.controller.Controller;
import com.nt.vo.EmpVO;


public class ClientTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext pCtx=null,cCtx=null;
		
		Controller c1=null;
		List<EmpVO> listVO=null;
		
	
		cCtx=new AnnotationConfigApplicationContext(PresentationAppConfig.class);
		pCtx=new AnnotationConfigApplicationContext(BussinesAppConfig.class);
		cCtx.setParent(pCtx);
	
		c1=cCtx.getBean("controller",Controller.class);
		
	
	
	
		
		try {
			listVO=c1.getEmpsByDesg("CLERK");
			//display 
			for (EmpVO vo : listVO) {
				System.out.println(vo.toString());
			}
			
		} catch (Exception e) {
			System.out.println("Internal Problem");
		}
		cCtx.close();
	}

}
