package com.nt.sk;

public class StringContainCharArray {
	public static void StrChar(String s, char ch) {
		String s2=s.toLowerCase();
		if (s2.contains("sha")) {
			System.out.println("available");
		} else {
			System.out.println("not");
		}
	} 
	public static void main(String[] args) {
		String a1="hello";
		System.out.println(a1.contains("h"));
		StrChar("harikrtinf", 'c');
	}
}









