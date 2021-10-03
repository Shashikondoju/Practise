package com.nt.upcastdowncast;

public class Test2 {

	public static void main(String[] args) {
		A a=new C();
		System.out.println(a.a);
		B b=(B)a;
		System.out.println(b.b);
		C c=(C)a;
		System.out.println(c.c);
		A a2=new B();
		C a1=new C();
		B b1=a1;
		System.out.println(b1.a+" "+b1.b);
		System.out.println(b1 instanceof C);
		System.out.println(a2 instanceof C);
	}

}
