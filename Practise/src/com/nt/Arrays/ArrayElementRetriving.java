package com.nt.Arrays;

public class ArrayElementRetriving {

	public static void main(String[] args) {
		int []a= {1,2,3,4};
		int[][]b= {{1,2,3},{3,4,5},{11,13,15}};
		int [][][]c= {{{1,2,3},{1,2,3},{2,3,4},{4,5,2}}};
		int [][][][]d= {{{{1,2,3},{3,2,1},{4,3,2},{2,3,4}}}};
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("==========");
		
		for (int i = 0; i <b.length; i++) {
			for (int j = 0; j <b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("============");
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int k = 0; k <c[i][j].length; k++) {
					System.out.print(c[i][j][k]+" ");
				}
				System.out.println();
			}
		}
		System.out.println("===========");
	
		for (int i = 0; i <d.length; i++) {
			for (int j = 0; j <d[i].length; j++) {
				for (int k = 0; k <d[i][j].length; k++) {
					for (int l = 0; l < d[i][j][k].length; l++) {					
						System.out.print(d[i][j][k][l]+" ");
					}
					System.out.println();
				}
			}
		}
		System.out.println("===========");

	}
}
