package com.nt.placements;

import java.util.Iterator;

public class star {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >=i; j--) {
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >=i; j--) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------");
		
		for (int i =1; i <= 4; i++) {
			for (int j =3; j >=i; j--) {
				System.out.print(" ");	
			}
				for (int j2 = 1; j2 <=i; j2++) {
					System.out.print("*");
				}
				System.out.println();
			}
		System.out.println("------------------------------------");
		
		for (int i =4; i >=1; i--) {
			for (int j = 3; j >=i; j--) {
				System.out.print(" ");
			}
			for (int k=1; k <=i; k++) {
				System.out.print("*");
			}
				System.out.println();
			}
		System.out.println("=================================");
		
		for (int i =1; i <=4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k =4; k>=i; k--) {
				System.out.print("@");
			}
			System.err.println();
		}
		}
	}
