package com.nt.staticvar;

public class Test2 {
	static int x=10;
	static int y=20;
	static {
		System.out.println("---Test11 SB1 called---");
		//System.exit(0);
		System.out.println("X : "+x);
		System.out.println("y : "+y);
	}
	static void m1(){
		System.out.println("X : "+x);
		System.out.println("y : "+y);
	}

	public static void main(String[] args) {
//		m1();
	}
	static {
		System.out.println("---Test11 SB2 called---");
		System.out.println("X : "+x);
		System.out.println("y : "+y);
		System.out.println("-----------------");
		m1();
	}

}
