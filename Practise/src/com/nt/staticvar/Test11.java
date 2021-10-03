package com.nt.staticvar;

public class Test11 {
	static {
		main(new String[0]);
	}
	public static void main(String[] aa) {
		System.out.println("HH");
		int a=10;
		a=20;
		System.out.println(a);
		Test11 t=new Test11();
		System.out.println(t.m1());
	}
	int m1(){
		int b=10;
		b=20;
		return b;
	}

}
