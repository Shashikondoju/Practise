package com.nt.oop;

public class c extends b {
	public void m1() {
		System.out.println("c m1");
	}
	public static void main(String[] args) {
		a a1=new c();
		b b1=(b)a1;
		b1.m1();
		b1.m2();
//		c c1=(c)a1;
//		c1.m1();
		a1.m1();
		a1.m2();
		int p=10, q=20;
		System.out.println(" "+ p+q);
		System.out.println(~1);
		System.out.println(12>>3);
		System.out.println(12>>>3);
	}
}
