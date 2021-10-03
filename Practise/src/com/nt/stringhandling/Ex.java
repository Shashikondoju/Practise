package com.nt.stringhandling;

public class Ex {

	public static void main(String[] args) {
		String s="abc";
		StringBuffer sb1=new StringBuffer("abc");
		StringBuilder sb2=new StringBuilder("abc");
		System.out.println(s.contentEquals(sb1));
		System.out.println(s.contentEquals(sb2));
		
		String s1="a1b2c3c4";
		String[] sp1=s1.split("[abc]");
		System.out.println(java.util.Arrays.toString(sp1));
		System.out.println("a".compareTo("A"));
		
	}
}
