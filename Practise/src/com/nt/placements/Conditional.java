package com.nt.placements;
import java.util.Scanner;
public class Conditional {
	public static void main(String[] args) {
		System.out.println("Enter the number to check");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n>0) {
			if (n%2==0) {
				System.out.println("even number");
			}
			if (n%2!=0) {
				System.out.println("Not a even number");
			}
		}
		if (n<0) {
			System.out.println("negitive number");
		}
		System.out.println("Task completed");
	}
}
