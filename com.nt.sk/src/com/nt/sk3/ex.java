package com.nt.sk3;

public class ex {

	public static String helloName(String str) {
		return "hello "+str.concat("... !");
	}
	
	public static void main(String[] args) {
		System.out.println(helloName("shashi"));
		System.out.println(rev("hi","bye" ));
		System.out.println(replace("<<>>","shashi" ));
		//System.out.println
		System.out.println("String reversal is: "+reverse("shashi"));
		display("software services");
		System.out.println(" ".equals(""));
		System.out.println("s"=="s7");
	}
	
	public static String rev(String st1,String st2 ) {
		return st1.concat(st2).concat(st2).concat(st1);
	}
	
	public static String replace(String s1, String s2) {
			return s1.substring(0,2).concat(s2).concat(s1.substring(2,4));
	}
	public static String reverse(String a) {
		char[]a1=new char[a.length()];
		int si=0;
		for (int i = a.length()-1; i >=0;i--) {
			a1[si++]=a.charAt(i);
		}
		System.out.println(java.util.Arrays.toString(a1));
		String s2=new String(a1);
		return s2;
	}
	
	
	public static void display(String word) {
		char ar[]=word.toCharArray();
		for (char c:ar) {
			if (word.indexOf(c)==word.lastIndexOf(c)) {
				System.out.println(c);
				break;
			}
		}
	}
	
}
