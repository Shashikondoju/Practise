package com.nt.sk2;

public class Occurance {
	public static void Occur(String a, String b) {
		String[] c=a.split("");
		int count=0;
		for (int i = 0; i < c.length; i++) {
			if (b.equalsIgnoreCase(c[i])) {
				count++;
			}
		}
		System.out.println(b+" is repeated times is: "+count);
		count=0;
	}
	
	public static void main(String[] args) {
		String s1="aabbcacas";
		String s2="a";
		
		String[] s3=s1.split("");
		System.out.println(java.util.Arrays.toString(s3));
		int count=0;
		for (int i = 0; i < s3.length; i++) {
			
			if (s2.equalsIgnoreCase(s3[i])){
					count++;
			}
		}
		
		System.out.println("a is repeated "+count+"  times");
	//	Occur(s1,"b");
	}

}
