package com.nt.staticvar;

public class Test13 {
	static int a;
	static int b;
	
	static void m1() {
		a=10;
		b=20;
	}
	static void m2() {
		System.out.println("static variables:"+a+" "+b);
	}
	static void m1(int x,int y) {
		a=x;
		b=y;
	}
	static void m2(int a,int b) {
		a=a;
		b=b;
	}
	static void m3(int a,int b) {
		Test13.a=a;
		Test13.b=b;
	}
	int x=0;
	static {
		System.out.println("static block");
		Test13 t=new Test13();
		t.x=100;
		System.out.println(t.x);
//		System.out.println(y);
	}
	static int y=10;
	
	public static void main(String[] args) {
		System.out.println(a+" "+b);
		m1();
		System.out.println(a+" "+b);
		m2();
		m1(11, 21);
		m2();
		m2(12,22);
		m2();
		m3(13,23);
		m2();
		System.out.println(new Test13().x);
	}

}
