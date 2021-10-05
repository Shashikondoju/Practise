package com.nt.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		int []ar= {12,1,3,4};
		String[] sr= {"shashi","shiva","ravi","saketh"};
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
