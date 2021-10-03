package com.nt.staticvar;

public class Test5 {
	int a=10;
	static int b=20;
	static int count=0;
	
	{
		count++;
		System.out.println("non static block");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	static{
		System.out.println(" static block");
		System.out.println("a: "+new Test5().a);
		System.out.println("b: "+b);
	}
	public static void main(String[] args) {
		new Test5();
		new Test5();
		new Test5();
		System.out.println("total objects are created is:"+count);
	}

}
