package com.nt.staticvar;

public class Test3 {
	int x=10;
	static void m1() {
		System.out.println("m1 in test3");
	}
	static {
		System.out.println("test3 static block");
	}
}
