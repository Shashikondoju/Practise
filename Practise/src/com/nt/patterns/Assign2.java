package com.nt.patterns;

public class Assign2 {

	public static void main(String[] args) {
		for (char i ='A'; i <='D'; i++) {
			for (char j ='A'; j<=i; j++) {
				System.out.print(i);
			}
			for (char j ='D'; j>i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("======================");
		int k=1;
		for (int i = 0; i <=5; i++) {
			for (int j=0; j <i; j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		System.out.println("=====================");
		char ch=65;
		for (int i ='A'; i <='D'; i++) {
			for (int j ='A'; j <=i; j++) {
				char ch1=(char) (ch);
				System.out.print(ch1+" ");
				ch++;
			}
			System.out.println();
		}
		System.out.println("===================");
	}

}
