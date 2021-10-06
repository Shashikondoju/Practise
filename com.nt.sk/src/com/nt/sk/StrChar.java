package com.nt.sk;

public class StrChar {

	public static void Checks(String s, char[] ca) {
		
		boolean flag=false;
		for (int i = 0; i <=s.length(); i++) {
			for (int j = 0; j <= ca.length; j++) {
				if (s.charAt(i)==(ca[i])) {
					System.out.println("available"+s.charAt(i));
				}		
			}
		}
		if (flag!=false) {
			System.out.println("available");
		} else {
			System.out.println("not available");
		}	
	}
	public static void main(String[] args) {
		String a="hari";
		char[] c= {'a','h','i'};
		System.out.println(c.length);
		Checks(a ,c);
//		char c1=a.charAt(0);
//		for (int i = 0; i <=c.length; i++) {
//			System.out.println(a.charAt(i));
//		}
	}

}
