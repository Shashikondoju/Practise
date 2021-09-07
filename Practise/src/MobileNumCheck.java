public class MobileNumCheck {

	public static void MobileCheck(String s) {
		if (s.length()==10) {
			boolean flag=false;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i)>='0' && s.charAt(i)<='9') {
					flag=true;
				}
			}
			if (flag!=false) {
				System.out.println("Valid mobile number");
			}
			else {
				System.out.println("Not a valid number");
			}
		}
		else
			System.out.println("mbl doesn't having 10 numbers...");
	}
	
	public static void AlphabetCheck(String s) {
		for (int i = 0; i <s.length(); i++) {
			if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
				System.out.println(s.charAt(i)+" : is Capital Letters");
			}
			else if (s.charAt(i)>='a' && s.charAt(i)<='z') {
				System.out.println(s.charAt(i)+" : is small Letters");
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {				
				System.out.println(s.charAt(i)+" : is numbers");
			}
			else
				System.out.println(s.charAt(i)+" : are special characters");
		}
	}
	
	public static void Reverse(String s) {
		for (int i =s.length(); i>=0; i--) {
	
		}
	}
	public static void main(String[] args) {
		MobileCheck("7712312377");
		MobileCheck("shashikuma");
		
		AlphabetCheck("ShashiKONDOJU@!#123");
		
		for (char i = 'a'; i <'d' ; i++) {
			System.out.println(i);
		}
		
	}

}
