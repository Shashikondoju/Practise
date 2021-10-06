package com.nt.sk2;

import java.util.ArrayList;

public class StringTest {

	public static void main(String[] args) {
		
		String s="Java by Hari";
		System.out.println(s.startsWith("Java"));
		System.out.println(s.startsWith("J"));
		System.out.println(s.startsWith("java"));
		System.out.println(s.endsWith("Hari"));
		System.out.println(s.endsWith("i"));//last char it checks
		System.out.println(s.endsWith("H"));
		
		ArrayList<Character>ar1=new ArrayList<>();
		for (int i=s.length()-1; i >=0; i--) {
			ar1.add(s.charAt(i));
//			System.out.println((s.charAt(i)));
		}
		System.out.println(ar1);
		String s2="bcb";
		String s3=ar1.toString();
		System.out.println(ar1.toString());
		System.out.println(s3);
		String [] s4=s3.split(",");
		for (int i = 0; i < s4.length; i++) {
			System.out.println(s4[i]);			
		}
		System.out.println(java.util.Arrays.toString(s4));
		
		System.out.println(s.substring(5,7));
		System.out.println(s.substring(1,7));
		
		String a="ab";
		String b1="b";
		String b="a"+"b";
		String b2="a"+b1;
		String b3=a.concat(b);
		
		System.out.println(a==b);
		System.out.println(a==b2);
		System.out.println(a==b3);
		
		System.out.println(s.replace('a', 'C'));
		System.out.println(s.replace("Java","JAVA"));
		System.out.println(s.replaceFirst("J", "C"));
		
		
		String rev="bcb";
		String rev1="";
		String[] sa=rev.split("");
		for (int i =sa.length-1; i>=0; i--) {
			rev1+=sa[i];
		}
	
		System.out.println(rev1);
		System.out.println(rev.equals(rev1));
		
		StringBuilder sb1=new StringBuilder(rev);
	
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		StringBuilder ass=new StringBuilder("object programming");
		ass.insert(7,"Oriented ");
		System.out.println(ass);
		ass.replace(0, 1, "O");
		ass.replace(16, 17, "P");
		ass.append(" Language");
		System.out.println(ass);
		
		String sss=ass.toString();
		System.out.println(sss);
		String sdf="a";
		String bdf=sdf.concat("v");
		System.out.println(bdf);
		
		System.out.println(10>>2);
		String str="Java is awesome";
		System.out.println(str.substring(7,12));
		
//		int [] a=new int[-4];
		
	
	}
}
