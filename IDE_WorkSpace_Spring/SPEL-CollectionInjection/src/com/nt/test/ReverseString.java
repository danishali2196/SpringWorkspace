package com.nt.test;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scn=null;
		scn=new Scanner(System.in);
		
		System.out.println("Enter String");
		String str=scn.nextLine();
		String reverse="";
		
		for(int i =str.length()-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
		}
		
		//System.out.println(str);
		System.out.println(reverse);
		

	}

}
