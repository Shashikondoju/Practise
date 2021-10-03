package com.nt.staticvar;

public class Test4 extends Test3 {
	static {
		System.out.println("Test4 static block");
	}
	static void m2() {
		m1();
		System.out.println("m2 in test4");
	}
	public static void main(String[] args) {
		m2();
	}

}
