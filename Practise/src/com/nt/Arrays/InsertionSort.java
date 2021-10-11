package com.nt.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[]a= {2,13,21,1,3};
		int key,j;
		for (int i = 0; i < a.length; i++) {
			key=a[i];
			j=i-1;
			while (j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		System.out.println(java.util.Arrays.toString(a));
	}

}
