package com.nt.placements;

import java.util.Iterator;

public class Calculation {

	public static void Sum(int n) {
		int sum=0;
		if (n<=0) {
			System.out.println("not a valid number");
		}
		else {
			int i=0;
			while (i<=n) {
				sum=sum+i;
				i++;
			}
		}
		System.out.println("Sum of given numbers is::"+sum);		
	}
	public static void Factorial(int n) {
		int fact=1;
		int i=1;
		if (n<=0) {
			System.out.println("Not a vaild number");
		}
		else {
			do {
				fact=i*fact;
				i+=1;
			}while(i<=n);
		}
		System.out.println("Factorial of a given num is"+fact);
	}
	 public static void Factors(int n) {
		 System.out.println("Factors of given numbers is::");
		 for (int i =1; i <=n/2; i++) {
			if (n%i==0) {
				System.out.println(i);
			}
		}
	 }
	 
	 public static void Break(int[] a) {
		 for (int i = 0; i < a.length; i++) {
			 if (a[i]==3) {
				 break;
//				 continue;
			 }
			 System.out.println(a[i]);
		 }
	 }
	public static void main(String[] args) {
		Sum(5);
		Factorial(5);
		Factors(10);
		Break(new int[] {1,2,3,4,5,11,22,12});
		System.out.println(3>2?"big":"no");
	}

}
