package com.nt.staticvar;

public class Test14 {
	
	static {
		System.out.println(Test14.x);
		int x = 60;
		Test14.x = Test14.x+x;
	
		x = x+Test14.x;

		Test14.x = Test14.x+x+Test14.x;
		
		System.out.println(Test14.x);
		System.out.println(x);
	}
	
	static int x =50;
	
	public static void main(String[] args) {
		System.out.println("class variable x:"+x);
		int x = 60;
		Test14.x = Test14.x+x;
	
		x = x+Test14.x;

		Test14.x = Test14.x+x+Test14.x;
		
		System.out.println(Test14.x);
		System.out.println(x);
	}


}
