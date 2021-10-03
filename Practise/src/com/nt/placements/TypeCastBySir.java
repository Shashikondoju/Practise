package com.nt.placements;

public class TypeCastBySir {

	void Implict() {
		byte b=10;
		System.out.println("byte"+b);
		short s=b;
		System.out.println("short"+s);
		s++;
		int i=s++;
		System.out.println("int"+i);
		System.out.println("shorttt"+s);
		long l=i;
		System.out.println("long"+(--l));
		float f=l;
		System.out.println("flaot"+(f+b));
		double d=(--f);
		System.out.println("double"+d);
		show();
		if (!(d==f)) {
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
		System.out.println(f+"   "+d);
	}
	public static void main(String[] args) {
		TypeCastBySir a1=new TypeCastBySir();
		a1.Implict();
	}
	static void show() {
		char c='A';
		int a=++c;
		System.out.println(a);
		TypeCastBySir a2=new TypeCastBySir();
		String s=a2.meth1();
		System.out.println(s);
	}
	private String meth1() {
		String s="hello";
		return s;
	}
	

}
