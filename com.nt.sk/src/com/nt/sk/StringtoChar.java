package com.nt.sk;

import java.util.Scanner;

public class StringtoChar {

	public static void CharSplit(String s) {
		int length=s.length();
		for (int i = 0; i < length; i++) {
			if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
				System.out.println("Letter Upper Case: "+s.charAt(i));
			}
			else if (s.charAt(i)>='a' && s.charAt(i)<='z') {
				System.out.println("Letter Lower Case: "+s.charAt(i));
			}
			else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				System.out.println("Numbers: "+s.charAt(i));
			}
			else
				System.out.println("Special charaters: "+s.charAt(i));
		}
	} 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details");
		String s=sc.nextLine();
		CharSplit(s);
	}

}
