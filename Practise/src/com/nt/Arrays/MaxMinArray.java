package com.nt.Arrays;

public class MaxMinArray {

	public static void main(String[] args) {
		int [] ar= {1,211,321,13};
		int min=ar[0],max=ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]>max) {
				max=ar[i];
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]<min) {
				min=ar[i];
			}
		}
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);

		int search=1;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]==search) {
				System.out.println("search element found");
			}
			else
				System.out.println("not found");
		}
	}

}
