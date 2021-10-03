
public class Armstrong {

	public static boolean isArm(int n) {
		if (n>1 && n<=9) { 
			return true; 
		}
		int pow=powe(n);
		System.out.println(pow);
		int cn=n;
		int sum=0;
		while (cn!=0) {
			int last=cn%10;
			int fact=1;
			for (int i = 0; i<pow; i++) {
				fact=last*fact;
			}
			sum=sum+fact;
			cn=cn/10;
		}
		if (sum==n) {
			return true;
		}
		return false;	
	}
	
	private static int powe(int n) {
		int p=0;
		while(n!=0) {
			p++;
			n=n/10;
		}
		return p;
	}
	
	public static void main(String[] args) {
		System.out.println(isArm(153));
	}

}
