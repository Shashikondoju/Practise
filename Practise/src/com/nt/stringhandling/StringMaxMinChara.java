package com.nt.stringhandling;

public class StringMaxMinChara {

	public static void main(String[] args) {
		String s="IAMINJAVADEVELOPMENT";
		s=s.replace('A', 'I');
		int []arr=new int[127];
		for (int i = 0; i <s.length(); i++) {
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
//			System.out.println(arr[s.charAt(i)]);
		}
		int max=0;
		char c=' ';
		char ch=' ';
		for (int i = 0; i <s.length(); i++) {
			if (max<arr[s.charAt(i)]) {
				max=arr[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		for (int i = 0; i <s.length(); i++) {
			if (max>arr[s.charAt(i)]) {
				max=arr[s.charAt(i)];
				ch=s.charAt(i);
			}
		}
		System.out.println("maximum: "+c);
		System.out.println("maximum: "+ch);
		
		String space="This is String ";
		System.out.println(space.replace(" ", ""));
		
	}

}
