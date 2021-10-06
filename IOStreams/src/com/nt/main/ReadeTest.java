package com.nt.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.nt.blogic.BankProject;

public class ReadeTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("accInfo.ser"));
		
		BankProject ac=(BankProject)ois.readObject();
		System.out.println(ac);
	}

}
