package com.nt.staticvar;

public class Test7 extends Test6 {
	public static void m1() {
		System.out.println("m1 in test6");
		Test6.m2();
	}
	static void m2() {
		System.out.println("m2 in test 7");
	}
	void m4(){
		System.out.println("non static void method");
	}
	static int a=10;
	int x=100;
			static {
//				x=300;
				new Test7().x=200;
			}
	public static void main(String[] args) {
		new Test7().m4();
		
		Test7 t1=new Test7();
		Test7 t2=new Test7();
		System.out.println("A : "+a);
		System.out.println("t1.A : "+t1.a);
		System.out.println("t2.A : "+t2.a);
		t1.a=30;
		System.out.println("t1.A : "+t1.a);
		System.out.println("t2.A : "+t2.a);
		t2.a=40;
		System.out.println("t1.A : "+t1.a);
		System.out.println("t2.A : "+t2.a);
	}

}
