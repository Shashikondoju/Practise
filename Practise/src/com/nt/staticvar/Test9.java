package com.nt.staticvar;

public class Test9 extends Test8 {
	static int y=11;
	static {
//		System.out.println(x);
		System.out.println(Test9.y);
		System.out.println(y);
		Test9.m3();
	}
	static int x =m2();
	static int m1() {
		System.out.println("Test22 : m1() called");
	return 20;
	}
	static void m3() {
		System.out.println("Static method");
	}
	public static void main(String[] args){
		System.out.println("X : "+x);
	} 

}
