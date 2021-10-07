package com.nt.patterns;

public class NewPatterns {

	public static void main(String[] args) {
		int count=1;
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		System.out.println("======================");
		int k=0;
		 for (int i =1; i <=3; i++) {
			 if (i%2!=0) {					
				 for (int j =1; j <=3; j++) {
					k++;
					System.out.print(k+" ");
				}
			 }
				else {
						int temp=k+1;
					for (int j2 =k+3; j2>=temp; j2--) {
						System.out.print(j2+" ");
						k++;
					}
			}
			 System.out.println();
		}
	}
}
