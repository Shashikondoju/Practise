package com.nt.oop;

public class Test2 extends Test1 {
	public void x() {
		System.out.println("x from test2");
	}

	public static void main(String[] args) {

		Test2 t1=new Test2();
		t1.y();
	}

}
