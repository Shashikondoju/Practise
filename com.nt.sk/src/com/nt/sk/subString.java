package com.nt.sk;

import java.util.Scanner;

public class subString {

	public static void main(String[] args) {
		System.out.println("Enter name");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s2=s.toLowerCase();
		
//		if ((s.substring(4, 8).equals("Hari"))) {
//			System.out.println("valid");
//		}
//		System.out.println(s.substring(4, 8)+" is available");
		
		if (s2.contains("hari")) {
			 int start=s2.indexOf("hari");
			 int end=start+4;
			 String ex=s.substring(start, end);
			 System.out.println(ex+" is available");
		}
		else
			System.out.println("hari is not available");
		
		int d=s.compareTo("hari");
		System.out.println(d);
		int a='s';
		int b='h';
		System.out.println(a+" "+b);
		
		for (int i = 0; i < s.length(); i++) {
			int ch=s.charAt(i);
			System.err.println(ch);
		}
	} 
	
	}

