package com.nt.stringhandling.exam;

public class PrimeCheck {
	public void isPrime(int num) 
	{
		int count=0;
		for (int i=2; i < num/2; i++) {
			if (num%i==0) {
				count++;
			}
			if (count==0) {
				System.out.println(num+" is a prime");
			}
			else
				System.out.println("not a prime");
		}
	}
	public static void main(String[] args) {
		new PrimeCheck().isPrime(7);
	}

}
