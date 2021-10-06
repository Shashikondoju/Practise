package com.nt.sk;

public class StringConcat {

	public static void main(String[] args) {

		String s="a"+"-b"+"-c"+"-d";
		System.out.println(s);
		
		String s1=String.join("-", "a","b","c","d","e");
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		System.out.println(s1=s1.toUpperCase());
		System.out.println(s1);
		String s2;
		System.out.println(s2=s1.toLowerCase());
		
	}

}
