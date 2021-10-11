package com.nt.Test3;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;
public class Test7 {
	static void FileWriter()throws Exception {
		FileWriter fw=new FileWriter("E:\\test.txt",true);
		Scanner sc=new Scanner(System.in);
		char[] str=sc.next().toCharArray();
		fw.write(str);
		fw.close();
		System.out.println("Data copied to file");
	}

	public static void main(String[] args) {
		try {
			FileWriter();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
