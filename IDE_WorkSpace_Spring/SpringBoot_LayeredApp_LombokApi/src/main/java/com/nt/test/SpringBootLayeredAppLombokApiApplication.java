package com.nt.test;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

import com.nt.config.AppConfig;
import com.nt.controller.MainController;
import com.nt.vo.StudentVO;

@SpringBootApplication
@Import(AppConfig.class)

public class SpringBootLayeredAppLombokApiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MainController controller=null;
		StudentVO  vo=null;
		Scanner sc=null;
		String sno=null,name=null,addrs=null,m1=null,m2=null,m3=null;
		String result=null;
		
		sc=new Scanner(System.in);
		System.out.println("Enter Student No");
		sno=sc.next();
		System.out.println("Enter Student Name::");
		name=sc.next();
		System.out.println("Enter Studnet Address");
		addrs=sc.next();
		System.out.println("Enter Student Mark1");
		m1=sc.next();
		System.out.println("Enter Student Mark2");
		m2=sc.next();
		System.out.println("Enter Student Mark3");
		m3=sc.next();
		
		sc.close();
		vo=new StudentVO();
		vo.setSno(sno);
		vo.setSname(name);
		vo.setSadd(addrs);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		
		ctx=SpringApplication.run(SpringBootLayeredAppLombokApiApplication.class, args);
		
		controller=ctx.getBean("controller",MainController.class);
		
		//invoke the method
		try {
			result=controller.processStudent(vo);
			System.out.println("Student Result::"+result);
		} catch (Exception e) {
			System.out.println("Internal Problem");
			e.printStackTrace();
		}
		
	}

}
