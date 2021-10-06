package com.nt.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.nt.blogic.BankProject;

public class BankProjectMain {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		BankProject b1=new BankProject();
		System.out.println(b1);
		
		b1.setAccHName("ShashiKumar");
		b1.setAccNum(12345);
		b1.setAccType("Savings");
		b1.setBalance(100000);
		b1.setPassword("12345");
		System.out.println(b1);
		
		b1.setBankName("SBI");
		b1.setBranch("Basar");
		b1.setIfsc("SBIN0014154");
	
		System.out.println(b1);

		System.out.println("Serialization started...");
		ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("accInfo.ser"));
			oo.writeObject(b1);
			System.out.println("Serialzation end");
			System.out.println("acc object saved in file sucessfully..");
			
	}

}
