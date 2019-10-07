 package Test;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Controller.MainController;
import VO.StudentVO;

public class RealTimeDITest {

	public static void main(String[] args) throws Exception {
		
		
		Scanner scn=null;
		String no=null,name=null,addrs=null,m1=null,m2=null,m3=null;
		String result=null;
		
		StudentVO vo=null;
		ApplicationContext ctx=null;
		MainController controller=null;
		
		scn=new Scanner(System.in);
		System.out.println("Enter Student Number::");
		no=scn.nextLine();
		System.out.println("Enter Student Name");
		name=scn.nextLine();
		System.out.println("Enter Student Address");
		addrs=scn.nextLine();
		System.out.println("Enter Student Marks1");
		m1=scn.nextLine();
		System.out.println("Enter Student Marks2");
		m2=scn.nextLine();
		System.out.println("Enter Student Marks3");
		m3=scn.nextLine();
		
		//create Student vo class object
		vo=new StudentVO();
		vo.setSno(no);
		vo.setSname(name);
		vo.setSadd(addrs);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		
		//create iOC container
		ctx=new ClassPathXmlApplicationContext("cfgs/applicationContext.xml");
		//get bean controller class object
		controller=ctx.getBean("controller",MainController.class);
		try {
			result=controller.processStudent(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Internal problem try again");
			e.printStackTrace();
			
			
		}
		
		((AutoCloseable) ctx).close();
	}

}
