package com.nt.test;

import java.util.Scanner;

import com.nt.vo.Vo;

public class ClientTest {

	public static void main(String[] args) {
		Scanner scn=null;
		String wno=null,wname=null,age=null,desg=null,wnominee=null,doj=null,dor=null;
		Vo vo=null;
		
		scn=new Scanner(System.in);
		System.out.println("Enter Worker No::");
		wno=scn.nextLine();
		System.out.println("Enter Worker Name::");
		wname=scn.nextLine();
		System.out.println("Enter Age::");
		age=scn.nextLine();
		System.out.println("worker Designation::");
		desg=scn.nextLine();
		System.out.println("Enter Nominee Name::");
		wnominee=scn.nextLine();
		System.out.println("Date Of Joining");
		doj=scn.nextLine();
		System.out.println("Date Of Retirement");
		dor=scn.nextLine();
		
		vo=new Vo();
		vo.setWorkerNo(wno);
		vo.setWorkerName(wname);
		vo.setAge(age);
		vo.setDesignation(desg);
		vo.setWorkerNominee(wnominee);
		vo.setDoj(doj);
		vo.setDor(dor);
		
		
		

	}

}
