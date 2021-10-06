package com.nt.sk;

import java.util.Scanner;

public class Assignment {
	
	public static void isEmpty(String s) {
		if (s.isEmpty()) {
			System.out.println("Not a valid user name");
		}
		else
			System.out.println("valid");
	}
	
	public static void Length(String s) {
		System.out.println("Given name length is"+s.length());
	}
	
	public static void passwordCheck(String s) {
		if(s.length()>=8 && s.length()<=16) {
			System.out.println("valid password");
		}
		else
			System.out.println("please choose in between 8 to 16");
	}
	
	public static void mobileCheck(String s) {
		boolean flag=false;
		if (s.length()==10) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='0' && s.charAt(i)<='9' ) 
//				System.out.println("valid");
				flag=true;
	}
		if (flag==true) {
			System.out.println("valid mobile number");
		}
	
		else
			System.out.println("enter valid mobile number");
	}
		else {
			System.out.println("please enter valid mobile number: ");
		}
			
}
	public static void nameCount(String s) {
		if (s.length()!=0 && !s.isBlank() && !s.isEmpty()) {
			System.out.println("Number of characters in given name is: "+s.length()+"and name: "+s);
		}
		else
			System.out.println("Try again");
	}
	
	public static void endsWith(String s) {
		System.out.println(s.endsWith(".txt"));
	}
	
	
	
	

	public static void main(String[] args) {
		String s="shashi";
		System.out.println(s.length());
		System.out.println(s.isBlank());
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		isEmpty(name);
		Length(name);
		passwordCheck(name);
		
		System.out.println("enter mobile number");
		String mob=sc.next();
		
		mobileCheck(mob);
		
		nameCount("shashikumar");
		nameCount("  ");
		
		endsWith("wwe.txt");
		
//		if (name.isEmpty()) {
//			System.out.println("enter valid name");
		
//		}
//		else 
//			System.out.println("Valid");
//		
		
		
		
	}

}
