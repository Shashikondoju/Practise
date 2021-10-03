package com.nt.upcastdowncast;

public class Test {
	public static void main(String[] args) {
		BtechStudent b1=new BtechStudent();
		b1.Meth();
		Student s1=b1;
		s1.Meth();
		Person p=new BtechStudent();
		p.Meth();
		BtechStudent b2=(BtechStudent)p;
		b2.Meth();
		Person p1=b1;
		p1.Meth();
	}
}
