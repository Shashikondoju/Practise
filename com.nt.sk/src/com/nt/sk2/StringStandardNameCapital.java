package com.nt.sk2;

public class StringStandardNameCapital {

	public static void main(String[] args) {
		String a="shashi kumar kondoju nagarkurnool telangana";
		String []sp=a.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < sp.length; i++) {
			
			sb=sb.append(sp[i].replaceFirst(".", (" "+sp[i].charAt(0)).toUpperCase()));
		}
		System.out.println(sb.toString().trim());
	}

}
