package com.nt.Test2;
public class Test1 {
	public static void Occur(String a, String b) {
		String[] c=a.split("");
		int count=0;
		for (int i = 0; i < c.length; i++) {
			if (b.equalsIgnoreCase(c[i])) {
				count++;
			}
		}
		if (count>0) {			
			System.out.println(b+" : is first repeated character ");
		}
		else {
			System.out.println("is not repeated...");
		}
		count=0;
	}
	public static void main(String[] args) {
		String a="IAMINJAVADEVELOPMENT";
		String b="I";
		String b1="J";
		Occur(a, b);
		Occur(a, b1);
	}

}
