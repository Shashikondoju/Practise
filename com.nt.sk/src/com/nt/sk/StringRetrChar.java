package com.nt.sk;

public class StringRetrChar {
	
	public static void StrCharat(String s) {
		char[] ch=s.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			count=1;
			for (int j =i+1; j < ch.length; j++) {
				if (ch[i]==ch[j] && ch[i]!=' ') {
					count++;
				}
			}
		}
		if (count>1) {
			System.out.println(count);
		}
	}
	
//	public static void NoOfOccurance(String s) {
//		int count=0;
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = 0; j < s.length(); j++) {
//				if (s.charAt(i).compareTo(charAt(j))) {
//						count++;
//				}
//					
//			}
//			
//		}
//	}
	
	public static void main(String[] args) {
		StrCharat("Java Programming");
//		NoOfOccurance("Java Programming");
	}

}
