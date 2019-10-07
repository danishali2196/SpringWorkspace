package com.nt.beans;

public class MyApp {
	
	public int empSal(String ename,int sal) {
		
		System.out.println("MyApp::empSal()");
		//logic
		System.out.println("Employee "+ename+" sal  "+sal);
		
		
		try {
			Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}
	
	public int cal(int no1,int no2) {
		System.out.println("MyApp.Cal()");
		
		System.out.println(no1 +" + " +no2);
		
		int sum=no1+no2;
		return sum;
	}

}
