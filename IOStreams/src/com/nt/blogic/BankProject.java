package com.nt.blogic;

import java.io.FileReader;
import java.io.Serializable;
import java.util.Properties;

import com.nt.helper.AccType;

public class BankProject implements Comparable<BankProject>, Serializable {
	
	public static String bankName;
	public static String branch;
	public static String ifsc;
	
	private int AccNum;
	String AccHName;
	double balance;
	transient String password;
	
	
	
	static {
		try (
//				BufferedReader br=new BufferedReader(new FileReader("Bankdetails"))
				FileReader fr=new FileReader("BankDetails.properties");
				){
					Properties pr1=new Properties();
					pr1.load(fr);
//					bankName=br.readLine();
//					branch=br.readLine();
//					ifsc=br.readLine();
			
					bankName=pr1.getProperty("BankName");
					branch=pr1.getProperty("Branch");
					ifsc=pr1.getProperty("Ifsc");
					System.out.println("static block executed..");
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		
				
				
	}

	private String accType;
	
	@Override
	public int hashCode() {
		return AccType.getAccTypeId(getAccType());		
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BankProject) {
			BankProject acc=(BankProject)obj;
			return this.accType.equals(acc.accType)
								&& this.AccNum==acc.AccNum;
		}
		return false;
	}

	public BankProject() {
		System.out.println("NPC executed..");
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		BankProject.bankName = bankName;
	}

	public static String getBranch() {
		return branch;
	}

	public static void setBranch(String branch) {
		BankProject.branch = branch;
	}

	public static String getIfsc() {
		return ifsc;
	}

	public static void setIfsc(String ifsc) {
		BankProject.ifsc = ifsc;
	}

	public String getAccHName() {
		return AccHName;
	}

	public void setAccHName(String accHName) {
		AccHName = accHName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("\n BankName:\t"+bankName);
		sb.append("\n BranchName:\t"+branch);
		sb.append("\n Ifsc: \t"+ifsc);
		sb.append("\n AccHName:\t"+AccHName);
		sb.append("\n balance:\t" + balance);
		sb.append( "\n password:\t" + password);
		sb.append("\n AccType:\t"+accType);
		
		return sb.toString();
	}

	public int getAccNum() {
		return AccNum;
	}

	public void setAccNum(int accNum) {
		AccNum = accNum;
	}

	

	@Override
	public int compareTo(BankProject acc) {
		int accTypeDiff=AccType.getAccTypeId( this.accType)-AccType.getAccTypeId(acc.accType);
		if (accTypeDiff==0) {
			long acNumDiff=this.AccNum-acc.AccNum;
			if (acNumDiff<0) {
				return-1;
			}
			else if (acNumDiff>0) {
				return 1;
			}
			else {
				return 0;
			}
		}
		return accTypeDiff;
		
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}
	
}
