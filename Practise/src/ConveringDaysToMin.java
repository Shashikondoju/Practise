import java.util.Scanner;

public class ConveringDaysToMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of Days");
		double days=sc.nextDouble();
		double hours=24*days;
		double min=60*hours;
		double secs=min*60;
		System.out.println("hours are: "+hours);
		System.out.println("Minutes are: "+min);
		System.out.println("no of sec: "+secs);
	}

}
