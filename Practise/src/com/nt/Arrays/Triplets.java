package com.nt.Arrays;

public class Triplets {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,7,11,12,13};
		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				for (int k =j+1; k <a.length; k++) {
					if (a[i]+a[j]+a[k]==10) {
						System.out.println("Triplets are: "+a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
	}
}
