package com.nt.test;

import java.lang.reflect.Constructor;

public class ReflectionAPItest {

	public static void main(String[] args)throws Exception {
		
		Class cls=null;
		Constructor cons[]=null;
		Demo d1=null,d2=null;
		//load the demo clss
		cls=Class.forName("com.nt.test.Demo");
		
		cons=cls.getDeclaredConstructors();
		
		cons[0].setAccessible(true);
		cons[1].setAccessible(true);
		
		d2=(Demo) cons[0].newInstance(10,20);
		System.out.println("sum is::"+d2.sum(10, 20));
		System.out.println("=======================");
		d1=(Demo) cons[1].newInstance();
		System.out.println("sum is::"+d1.sum(30, 40));
		

	}

}
