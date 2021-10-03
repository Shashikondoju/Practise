package com.nt.stringhandling;

public class Reverse {
	public static String Rev(String str) {
		String str2=str;
		StringBuilder sb=new StringBuilder("");
		String rev=" ";
		for (int i =str.length()-1; i>=0; i--) {
			sb=sb.append(str.charAt(i));
			rev=rev+str.charAt(i);
		}
		System.out.println(rev.trim());
		
		if (str2.equals(rev.trim())) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("not a plindrome");
		return sb.toString();
		
	}
	public static void main(String[] args) {
		System.out.println(Rev("shashi"));
		System.out.println(Rev("tomot"));
		String s1="shashi kumar kondoju";
		String s2=s1.replaceAll("\\s","");
		System.out.println(s2);
		String s3=new String("hello");
		String s4=new String("hellow");
		System.out.println(s3=s4);
		String st1="java";
		String st2="java";
		System.out.println(st1.equals(st2));
		System.out.println(st1==st2);
		int a=1;
		System.out.println(st2+=a);
		String s="java String arra";
		System.out.println(s.substring(4, 7));
		
	}

}
