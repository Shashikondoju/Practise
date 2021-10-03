package com.nt.Test2;

import java.util.Scanner;

public class Test4 {
	public static boolean isCheck(String s1) {
		
		for (int j = 0; j <s1.length(); j++) {
			if (Character.isDigit(s1.charAt(j))==false) {
				return false;
			}
		}
		return true;
	}
	public static String isType(String str) {
		int i=0;
	//	char ch=' ';
		boolean b=false;
		
		if (i==Integer.parseInt(str)) {
			return "Integer";
		}
		else if(b==Boolean.parseBoolean(str)) {
			return "Boolean";
		}
		return "String";
	}
	public static void main(String[] args) {
		System.out.println("enter");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		if (isCheck(s1)) {
			System.out.println("Integers");
		}
		else if (isCheck(s1)) {			
			System.out.println("String");
		}
		else {
			System.out.println("character");
		}
		System.out.println("checking purpose: "+isType(s1));
	}
}
