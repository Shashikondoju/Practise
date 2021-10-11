package com.nt.Test3;

public class Test {
	void m1() {
		System.out.println("m1");
	}
	int a;
	public Test(int a) {
		this.a=a;
		System.out.println("Param");
	}
	public Test() {
		System.out.println("No-param");
	}
	public static void main(String[] args) {
		Test t=new Test(10);
		Test t2=new Test(); 
	int a=10;
	Integer i=Integer.valueOf(a);
	int b=i.intValue();
	}

}
