package com.nt.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		int f=7,c=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==f) {
				c=1;
				System.out.println("Element found::"+a[i]);
				break;
			}
		}
		if (c==0) {
			System.out.println("element not found");
		}
	}

}
