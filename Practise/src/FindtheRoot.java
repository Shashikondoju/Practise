import java.util.Scanner;
public class FindtheRoot {
	public static void FindTheDis(double a, double b, double c) {
		double r1 = 0, r2 = 0;
		double dis =((b * b) - (4 * a * c));
		
		  if (dis>0) {
			  System.out.println("There are real roots: ");
			  r1=((b+(Math.sqrt(dis)))/2*a); 
			  r2=((b-Math.sqrt(dis))/2*a); 
		  }
		  else if (dis==0) {
			  System.out.println("There is one real root");
			  r1=-b/2*a; 
			  r2=-b/2*a;
			 }
		  else {
			System.out.println("roots are imaginary roots");
			System.out.println((-b / (2 * a) + " + i"+ (Math.sqrt(dis)) )+ "\n"+ (-b / (2 * a)+ " - i" + Math.sqrt(dis))); 
			return;
		  } 
		 
		  System.out.println("Roots are: "+r1+" "+r2);
		 
			/*
			 * double r3 = 0, r4 = 0; r3 = (b + Math.sqrt(dis)) / 2 * a; r4 = (b -
			 * Math.sqrt(dis)) / 2 * a; System.out.println(r3 + " " + r4);
			 */

	}

	public static void main(String[] args) {
		System.out.println("Enter polynominal equation values: ");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c=sc.nextInt();
		FindTheDis(a, b, c);
		sc.close();
			
	}

}
