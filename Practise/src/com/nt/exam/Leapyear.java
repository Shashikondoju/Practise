package com.nt.exam;

public class Leapyear {
	public boolean isLeap(int year) {
		if (year%4==0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Leapyear l= new Leapyear();
		System.out.println(l.isLeap(2014));
		System.out.println(l.isLeap(2020));
	}

}
