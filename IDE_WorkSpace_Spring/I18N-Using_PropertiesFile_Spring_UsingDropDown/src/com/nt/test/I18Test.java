package com.nt.test;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class I18Test {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx=null; 
		Locale l=null;
		String s1,s2,s3,s4;
		JButton btn1,btn2,btn3,btn4;
		JFrame jf=null;
		
				
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//get message
		l=new Locale(args[0],args[1]);
		
		s1=ctx.getMessage("label1", null, "msg1", l);
		s2=ctx.getMessage("label2", null, "msg2", l);
		s3=ctx.getMessage("label3", null, "msg3", l);
		s4=ctx.getMessage("label4", null,"message", l);
	
		
		jf= new JFrame("I18N Spring Test");
		//create button by getting labels from activated property file
		btn1=new JButton(s1);
		btn2=new JButton(s2);
		btn3=new JButton(s3);
		btn4=new JButton(s4);
	
		jf.setLayout(new FlowLayout());
		jf.add(btn1);
		jf.add(btn2);
		jf.add(btn3);
		jf.add(btn4);
		
		jf.setVisible(true);
		jf.pack();
		ctx.close();
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		
	}//main

}//class
