package com.nt.sk;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class EndwithString {
	static HashSet<String>h=new HashSet<>();
	public static void EndsWith(String [] s) {

		for (int i = 0; i < s.length; i++) {
			if (s[i].endsWith(".txt")) {
				h.add(s[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] ex={"sd.txt", "ss.txt", "sd.doc","aa.txt","bb.doc","bb.txt","bb.txt"};
		EndsWith(ex);
		System.out.println(h);
	}

}
