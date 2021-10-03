package com.nt.placements;

public class Staticinner {
	int b=10;
	static class A{
		void ma1() {
			System.out.println("inner non static");
		}
		class B{
			//System.out.println("inner static method");
		}
		static void ma2() {
			int x=10;
			System.out.println("inner static method");
			//new StaicInner().a;
			System.out.println(x);
		}
	}
	static {
		int x=10;
		System.out.print(x+" ");
	}
	static int xx;
	static {
		xx=100;
	}
	public static void main(String[] args) {
		int b=20;
		A a=new A();
		a.ma1();
		A.ma2();
		int x=20;
		System.out.println(x);
		System.exit(0);
		System.out.println(xx);
	}

}
