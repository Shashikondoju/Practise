package com.nt.sk;

public class StringSplit {

	public static void main(String[] args) {

		String s="How Are you?";
		String s2=reverseWords(s);
		
		String s3="How old are you?";
		String s4=reverseWords2(s3);
		System.out.println(s4);
				
		String s5=reverseChar(s3);
		System.out.println(s5);
		
		System.out.println();
		System.out.println(s2);
		String[] s1=s.split(" ");
		System.out.println(java.util.Arrays.toString(s1));
		int len=s1.length;
		System.out.println(len);
		for (int i = len-1; i >=0; i--) {
			System.out.print(s1[i]+" ");
		}
		
		String rep="hello! arry@1asdf";
		 
	}
	static String reverseWords(String s) {
		String st="";
		String[] words=s.split(" ");
		for (int i =words.length-1 ; i>=0 ; i--) {
			st=st.concat(words[i]+" ");
		}
		st=st.trim();

		return st;
	}
	
	static String reverseWords2(String s) {
		
		StringBuilder  st=new StringBuilder();
		String[] words=s.split(" ");
		for (int i =words.length-1 ; i>=0 ; i--) {
			st.append(words[i]);
			st.append(" ");
		}
		return st.toString().trim();

	}
	
	static String reverseChar(String s) {
		StringBuilder st=new StringBuilder();
		
		for (int i =s.length()-1; i>=0; i--) {
			st.append(s.charAt(i));
		}
		return st.toString();
	}
	
	
	

}
