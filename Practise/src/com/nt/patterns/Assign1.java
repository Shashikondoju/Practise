package com.nt.patterns;

public class Assign1 {

	public static void main(String[] args) {
		for (char i = 'A'; i <='E'; i++) {
			for (char j ='A' ; j<= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("======================");
		for (char i = 'A'; i <='E'; i++) {
			for (char j ='A' ; j<= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("======================");
		
		for (int i =1; i <=5; i++) {
			for (int j =1 ; j<=i; j++) {
				if ((i+j)%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		System.out.println("=========================");

		for (int i =5; i>=1; i--) {
			for (int j =1; j<=i; j++) {
				if ((i+j)%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		System.out.println("=========================");
		for (int i =1; i <=5; i++) {
			for (int j =1 ; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("=========================");
		for (int i =5; i >=1; i--) {
			for (int j =1 ; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("=========================");
		for (int i =5; i >=1; i--) {
			for (int j =1 ; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("=========================");
		for (int i=1; i <=5; i++) {
			for (int j=5 ; j>=i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("=========================");
		for (int i=1; i <=5; i++) {
			for (int j=5 ; j>=i; j--) {
				if (i%2==0) {
					System.out.print("1");
				}
				else
					System.out.print("0");
			}
			System.out.println();
		}
		System.out.println("=========================");
		for (int i =1; i <=5; i++) {
			for (int j =1; j <=5; j++) {
				if (i==1|| i==5 || j==1||j==5) {	
					System.out.print("* ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("======================");
		for (int i =1; i <=5; i++) {
			for (int j =5; j >=i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("=====================");
		for (int i =1; i <=5; i++) {
			for (int j =1; j <=i; j++) {
				if (j==1 ||j==i ||i==1||i==5) {					
					System.out.print("* ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	
}
