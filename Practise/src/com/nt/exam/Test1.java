package com.nt.exam;

public class Test1 {

	public static void main(String[] args) {
		for (int i =1; i <=4; i++) {
			for (int j =3; j >=i; j--) {
				System.out.print(" ");
			}
			for (int k =1; k <=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("=================");
		//5.
		for (int i =1; i <=5; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	System.out.println("==================");
	//3.
	for (int i =1; i <=5; i++) {
		for (int j =1; j <=i; j++) {
			System.out.print(j);
		}
		for (int k =i-1; k >=1; k--) {
			System.out.print(k);
		}
		System.out.println();
	}
System.out.println("==================");


		for (int i = 0; i <=5; i++) {
			for (int j = 4; j >=i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = 1; i <=4; i++) {
			for (int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			for (int k =1; k <=i; k++) {
				System.out.print(" * ");
			}
			for (int l =i-1; l>=1; l--) {
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("========================");
		System.out.println();
		for (int i =4; i >=1; i--) {
			for (int j = 1; j <=4-i; j++) {
				System.out.print(" ");
			}
			for (int k =1; k <=i; k++) {
				System.out.print("*");
//				System.out.print(k);
			}
			for (int l=i-1 ; l>=1; l--) {
				System.out.print("*");
//				System.out.print(l);
			}
			System.out.println();
		}
	}

}
