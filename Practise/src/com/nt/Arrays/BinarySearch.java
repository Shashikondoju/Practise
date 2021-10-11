package com.nt.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		int low=0,mid, key=1,found=0;
		int high=a.length-1;
		for (int i = 0; i < a.length; i++) {
			
		while (low<=high) {
			mid=(low+high)/2;
			if (key<a[mid]) {
				high=mid-1;
			}
			else if (key>a[mid]) {
				low=mid+1;
			}
			else if (key==a[mid]) {
				System.out.println("Element found");
				found=1;
				break;
			}
		}
		}
		if (found==0) {
			System.out.println("not found");
		}
		
	}
}
