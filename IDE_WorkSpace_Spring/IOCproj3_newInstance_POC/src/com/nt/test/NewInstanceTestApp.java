package com.nt.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstanceTestApp {

	public static void main(String[] args)throws ClassNotFoundException,
												 IllegalAccessException,
												 InstantiationException,
												 InvocationTargetException {
		
		Class c1=Class.forName("args[0]");
		Object o1=c1.newInstance();
		System.out.println("obj1"+o1);
		
		Constructor cons[]=c1.getDeclaredConstructors();
		Object o2=cons[1].newInstance();
		System.out.println("object"+o2 );
	
		Object o3=cons[2].newInstance(10,20);
		System.out.println("obj3"+o3);
		
	}

}
