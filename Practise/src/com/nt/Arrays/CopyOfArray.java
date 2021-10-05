package com.nt.Arrays;

public class CopyOfArray {

	public static void main(String[] args) {
		int [] ar= {12,10,13,14,15};
		int[]ar2=new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			ar2[i]=ar[i];
		}
		System.out.println(java.util.Arrays.toString(ar));
		System.out.println(java.util.Arrays.toString(ar2));
		
		
	}

}
 