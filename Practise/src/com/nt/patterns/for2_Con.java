package com.nt.patterns;

public class for2_Con {

	public static void main(String[] args) {
		//using only one loop
		int ii=1;
		int jj=0;
		for (ii=1; ii <=5;) {
			if(jj<ii) {
				System.out.print("#");
				jj++;
			}
			 if(jj==ii) {
				System.out.println(" ");
				ii++;
				jj=0;
			}
		}
		
		
		
		for (int i = 0; i <5; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		for (int i =5; i >=1; i--) {
			for (int j =1; j <=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		for (int i =1; i<=5; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print(" ");
			}
			
			for (int k =5; k>=i; k--) {
				System.out.print(k);
			}
			System.out.println();	
		}
		
		
		
		System.out.println("===================");
		for (int i=5; i >=1; i--) {
			for (int j=1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int k =5; k >i; k--) {
				System.out.print("@");
			}
			for (int k =5; k >=i; k--) {
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
