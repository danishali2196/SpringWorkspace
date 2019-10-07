package com.nt.test;

import com.nt.service.Adhar;
import com.nt.service.AdharMgmtServiceImplService;

public class AdharApp {

	public static void main(String[] args) {
		
		
		AdharMgmtServiceImplService service = new AdharMgmtServiceImplService();
		
		System.out.println("AdharApp.main()");
		
		Adhar adhar =service.getAdharMgmtServiceImplPort();
		System.out.println("AdharApp.main()");
		adhar.fetchRecord(5);
		System.out.println("AdharApp.main()");
		System.out.println(adhar.toString());

	}

}
