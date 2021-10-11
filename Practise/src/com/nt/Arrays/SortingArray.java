package com.nt.Arrays;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		int []ar= {12,1,3,4};
		Scanner s=new Scanner(System.in);
		System.out.println("enter string length");
		int length=s.nextInt();
		String[] sr=new String[length];
		System.out.println("Enter String Elements::");
		for (int i = 0; i < sr.length; i++) {
			sr[i]=s.next();
		}
		java.util.Arrays.sort(sr);
		System.out.println(java.util.Arrays.toString(sr));
		for (int i = 0; i < sr.length; i++) {
			for (int j =i+1; j < sr.length; j++) {
				if (sr[i].compareTo(sr[j])>0) {
					String tem=sr[i];
					sr[i]=sr[j];
					sr[j]=tem;
				}
			}
		}
		System.out.println(java.util.Arrays.toString(sr));
		
		java.util.Arrays.sort(ar);
		System.out.println(java.util.Arrays.toString(ar));
		for (int i = 0; i < ar.length; i++) {
			for (int j =i+1; j < ar.length; j++) {
				int temp=0;
				if (ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println(java.util.Arrays.toString(ar));
	}

}
