package com.nt.placements;

public class TestIn {

	public static void main(String[] args) {
		int a=10;
		TestIn t1=new TestIn();
		//t1.m1(1);
		//t1.m2(1); must have termination statement 
		//t1.increment(1);
//		t1.m3();
		t1.Ternary();
	}
	public void increment(int a) {
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
		a++;
		System.out.println(a--);
		System.out.println(--a);
		--a;
		System.out.println(a++);
		System.out.println(a);
	}
	
	public void m1(int a) {
		while (a<=15) { 
			System.out.println(a);
			a++;
		}
	}
	public void m2(int a) {
		while(a<10)
			System.out.println(a);
	}
	public void m3() {
		int i=1;
		for (System.out.println("intial@@"); i<10;System.out.println("myloop")) {
			System.out.println(i);
			System.out.println("java".concat(" is").concat(" Awesome"));
			i++;
		}
	}
	public void Ternary() {
		System.out.println(15>12 ? "yes":"no");
		System.out.println(10>>2);
		System.out.println(5|7);
		
	}

}
