
public class Palindrome {

	public static void main(String[] args) {
		int a=121;
		int b=a;
		int sum=0;
		while (a!=0) {
			int rem=a%10;
			sum=(sum*10)+rem;
			a=a/10;
		}
		if (sum==b) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not a palindrome");
		
	}

}
