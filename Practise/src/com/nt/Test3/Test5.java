package com.nt.Test3;
public class Test5 {

	public static void main(String[] args) {
		int []a= {1,2,3,4};
		int [][]b= {{10,20},{30,40,50}};
		int [][][]c= {{{10,20},{30,40,50}},{{60,70},{80,90}}};
		
		for (int i = 0; i <a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("========");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("======");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int k= 0; k < c[i][j].length; k++) {	
					System.out.print(c[i][j][k]+" ");
				}
				System.out.println();
			}
//			System.out.println();
		}
	}
}
