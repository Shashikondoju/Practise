package com.nt.sk3;

public class ex2 {

	public static void foo(String s) {
		System.out.println("String class");
	}
	public static void foo(StringBuffer s) {
		System.out.println("String Buffer class");
	}
	
	public static void main(String[] args) {
//		foo(null); //will get an ambiguous error because 2 methods can take same value
	
		String s1="abc";
		StringBuffer s2=new StringBuffer(s1);
		String s4=new String(s1);
		System.out.println(s1.contentEquals(s2));
		String s3=s1.intern();
		System.out.println(s3==s1);
		s4.intern();
		System.out.println(s3==s4);
	}

}
