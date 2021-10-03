package com.nt.staticvar;

public class Test1 {
	static int a=11;
	int b=12;
	static {
		System.out.println("Static block");
	}
	void m1() {
		System.out.println("non static method we can acees static varibles:"+a);
	}
	static void m2() {
		System.out.println("static method accessing non static variable"+new Test1().b);
	}
	public static void main(String[] args) {
		int a=20;
		System.out.println("In side main method..");
		System.out.println("Local preference: "+a);
		System.out.println("From class level: "+Test1.a);
		//int b;System.out.println(b); //with out initialization we can't access
	//	static int b=11;
		//class level variable can't be access in method
		new Test1().m1();
		m2();
		int b;
//		System.out.println(b);
		b=21;
		System.out.println(b);
	}

	static {
		System.out.println("static block 2");
		 a=10;
		a=a;
		System.out.println("In side static block: "+a);
		new Test1().m1();
	}
}
