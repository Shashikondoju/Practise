package com.nt.Test3;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class Test6 {

	public static void main(String[] args)throws Exception {
		
		FileInputStream f1=new FileInputStream("E:\\Test1.txt");
		FileInputStream f2=new FileInputStream("E:\\Test2.txt");
		FileInputStream f3=new FileInputStream("E:\\Test3.txt");
		
		SequenceInputStream sq=new SequenceInputStream(f1, f2);
		SequenceInputStream sq2=new SequenceInputStream(sq, f3);
		
		int j;
		if ((j=sq2.read())!=-1) {
			System.out.print((char)j);
		}
		
	}

}
