package com.nt.placements;

public class TypeCast2 {

	public static void main(String[] args) {
		char ch1=250;
		System.out.println(ch1);
		char ch2='a';
		byte a=(byte)(int)ch2;
		float b=a;
		System.out.println(a);
		System.out.println(b);
		double c=b;
		System.out.println(c);
		long l=3l;
		System.out.println(l);
		float f=l;
		System.out.println(f);
		long l2=(long)f;
		char ch=97;
		System.out.println(ch);
		int i=ch;
//		char ch2=(char)i;
		System.out.println(i);
		int b1=97;
		char ch3=(char)b1;
		System.out.println(ch3);
		int i2=b1;
		System.out.println(i2);
		short s=(short) ch;
		System.out.println(a);
		System.out.println(l2);
		byte bb=(byte)i2;
		short ss=bb;
		byte bbb=(byte) ss;
		char chhh=257;
		System.out.println(chhh);
		double dd='a';
		System.out.println(dd);
		double ddd=10L;
		System.out.println(ddd);
		float ff=10f;
		char c3='d';
		int ac=c3;
		short sc=(short) c3;
		byte by=(byte)c3;
		
		
	}
}
