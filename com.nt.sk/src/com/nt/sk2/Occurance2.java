package com.nt.sk2;

public class Occurance2 {

	public static void main(String[] args) {
		String s1="aabbcacas";
		//String s2="a";
		
		String[] s3=s1.split("");
		System.out.println(java.util.Arrays.toString(s3));
		int count=0;
		for (int i = 0; i < s3.length; i++) {
			
		for (int j = 0; j < s3.length; j++) {
			if (s3[i].equals(s3[j])) {
				count++;
			}
		}//for 2
		System.out.println(s3[i]+" count is: "+count);
		count=0;
		}
	}
}
		
