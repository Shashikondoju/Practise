package com.nt.staticvar;

public class Test12 {
	
	static {
		System.out.println("static block1");
	}
	static int a=m1();
	static {
		System.out.println("static block2");
	}
	public static void main(String[] args) {

	}

	private static int m1() {
		System.out.println("m1 method is executed");
		return 11;
	}
	static int b=1;

}
