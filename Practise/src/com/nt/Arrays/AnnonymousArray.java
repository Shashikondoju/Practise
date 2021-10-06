package com.nt.Arrays;

public class AnnonymousArray {

	public static void main(String[] args) {
		sum(new int[] {1,2,3,4});
		display(new int[][] {{1,2,3},{3,4,5}});
	}
	static void sum(int[]a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("sum is:"+sum);
	}
	static void display(int[][]b) {
		int sum=0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				sum=sum+b[i][j];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(sum);
	}
}
