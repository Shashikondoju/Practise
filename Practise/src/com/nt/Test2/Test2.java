package com.nt.Test2;

public class Test2 {
	
	public static void main(String[] args) {
		String s="Software";
		char c=s.charAt(s.length()-1);
		StringBuilder sb=new StringBuilder();
		sb=sb.append(c);
		for (int i = 1; i <=s.length()-2; i++) {
			sb=sb.append(s.charAt(i));
		}
		sb.append(s.charAt(0));
		System.out.println(sb);
		
	}
}
