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

}
