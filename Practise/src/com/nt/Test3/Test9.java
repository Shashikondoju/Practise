package com.nt.Test3;

public class Test9 {
	
	static void StringPer(String str, String res){
        if (str.length() == 0) {
            System.out.print(res + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + 
                         str.substring(i + 1);
            StringPer(ros, res+ch);
            System.out.print(ch+":");
        }
    }
	public static void main(String[] args) {
		String str="abc";
		StringPer(str, " ");
	}
}
