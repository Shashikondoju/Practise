package com.nt.sk;

public class CheckAssign {

	public static void checkUser(String s1, String s2) {
		if (s1.equalsIgnoreCase("Gabbarsingh") && s2.equals("PawanKalyan")) {
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");
	}
	public static void main(String[] args) {
		checkUser("gabbarsingh", "PawanKalyan");
		checkUser("gabbarsingh", "pawanKalyan");
	}

}
