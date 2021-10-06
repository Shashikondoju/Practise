package com.nt.patterns;

import java.util.Iterator;

public class Pattern2 {
	public static void main(String[] args) {
		for (int i=1; i <=4; i++) {
			for (int j=1;j <=4-i; j++) {
				System.out.print(" ");
			}
			for (int k =1; k <=i; k++) {
				System.out.print(k);
			}
			for (int l = i-1; l>=1; l--) {
				System.out.print(l);
			}
			System.out.println();
		}
		
		/*
		 * for (int i =4; i >=1; i--) { for (int j =1; j <=4-i ; j--) {
		 * System.out.print(" "); } for (int k = 0; k <=i; k++) { System.out.print("X");
		 * } for (int j =i-1; j>=1; j--) { System.out.println("X"); }
		 * System.out.println(); }
		 */
	}
}
