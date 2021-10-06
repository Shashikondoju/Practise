package com.nt.sk;

public class StrArray {
	
	public void strArr(String ar[]) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]==ar[i].toLowerCase()) {
				System.out.println(ar[i].toUpperCase());
			}
			else
				System.out.println(ar[i].toLowerCase());
		}
	}
	
	public void strArr2(String[] s) {
		
		for (int i = 0; i < s.length; i++) {
			if (i%2==0) {
				System.out.println("even string array values: "+i+" "+s[i].toUpperCase());
			}
			else
				System.out.println("odd string array values: "+i+" "+s[i]);
		}
	}
	
	public String repStr(String a) {	//replace method
		String[] s=a.split("");
		String s1=s[0].toUpperCase();
			return a.replaceFirst(".",s1);
	}
	
	public String upCase(String s) {
		String[] s2=s.split(" ");
		String sp1=s2[0];
		String sp2=s2[1];
		String[] s3=s2[0].split("");
		String s4=s3[0].toUpperCase();
		String s5=sp1.replaceFirst(".",s4);
		
		String[] sa=s2[1].split("");
		String sa1=sa[0].toUpperCase();
		String s7=sp2.replaceFirst(".", sa1);
	
		return s5+" "+s7;
	}
	
	private int indexOf(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		
		String[] ar= {"abc", "bac", "ADFG"};
		StrArray st=new StrArray();
		st.strArr(ar);
		st.strArr2(ar);
		String s=st.repStr("shiva");
		System.out.println(s);
		System.out.println(st.upCase("shashi kumar"));
		System.out.println(st.upCase("shashi"));
		String st1="shashi kumar";
		System.out.println();
		System.out.println(" returning"+st.upCase(st1));
		System.out.println();
		String st2="hari krishna";
		System.out.println(" returning====="+st.upCase(st2));
		
//		char c=st1.charAt(0);
//		for (int i = 0; i < st1.length(); i++) {
//			if (st1.charAt(i)==' ') {
//				System.out.println(i);
//				String str1=(String)st1.charAt(i);
//				st.replace(st1, .toUppercase());
//			}
//		}
	}
}
