package com.nt.exam;

import java.util.Iterator;

public class test2 {
	public static void main(String[] args) {
		for (int i =1; i <=5; i++) {
			for (int j =1; j<=5; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		System.out.println("==================");
		 for (int i = 1; i <=10; i++) 
	        {
	            int num = i;
	            for (int j = 1; j <= i; j++) 
	            {
	                System.out.print(num+" ");
	                 
	                num = num+10-j;
	            }
	            System.out.println();
	        }
		 System.out.println("=====================");
		 for (int i = 1; i <=3; i++) 
	        {
	            int num = i;
	            for (int j = 1; j <=3; j++) 
	            {
	                System.out.print(num+" ");
	                 
	                num = num+3-j;
	            }
	            System.out.println();
	        }
	         
	}
}
