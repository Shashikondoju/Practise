package com.nt.sk;

public class StrChar2 {

	public static void replaceAlp(String [] a) {
//		int length=a.length;
		for (int i = 0; i < a.length; i++) {
			String[] rep=a[i].split(" ");
			String s1=rep[0];
			String s2=rep[1];
			
			String[] s1a=s1.split("");
			String s1b=s1a[0].toUpperCase();
			String sf1=s1.replaceFirst(".", s1b);
			
			String[] s2a=s2.split("");
			String s2b=s2a[0].toUpperCase();
			String sf2=s2.replaceFirst(".", s2b);
			
			System.out.println(sf1+" "+sf2);
		}
	}
	public static void main(String[] args) {
		String [] s= {"shashi kumar","shiva prasad","hari krishna","ravindra chary","saketh"};
		replaceAlp(s);
	}

}
