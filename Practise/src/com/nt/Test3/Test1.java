package com.nt.Test3;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string length");
		int length=s.nextInt();
		String[] sr=new String[length];
		System.out.println("Enter String Elements::");
		for (int i = 0; i < sr.length; i++) {
			sr[i]=s.next();
		}
		System.out.println("Initial array is:"+java.util.Arrays.toString(sr));
		for (int i = 0; i < sr.length; i++) {
			for (int j =i+1; j < sr.length; j++) {
				if (sr[i].compareTo(sr[j])>0) {
					String tem=sr[i];
					sr[i]=sr[j];
					sr[j]=tem;
				}
			}
		}
		System.out.println("After sorting:"+java.util.Arrays.toString(sr));
	}

}
