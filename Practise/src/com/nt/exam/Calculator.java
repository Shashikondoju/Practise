package com.nt.exam;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("enter your choice \n1. add \n2.subtraction \n3.multiplication\n4.Division");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		System.out.println("Enter your values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch (key) {
		case 1: {
			int c=a+b;
			System.out.println("addition"+c);
			break;
		}
		case 2:{
			int c=a-b;
			System.out.println("subtraction"+c);
			break;
		}
		case 3:{
			int c=a*b;
			System.out.println("multiplication"+c);
			break;
		}
		case 4:{
			System.out.println("division"+(a/b));
			break;
		}
		default:
			System.out.println("enter valid choice");
		}
	}

}
