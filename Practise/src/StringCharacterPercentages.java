import java.text.DecimalFormat;

public class StringCharacterPercentages {

	public static void StringPer(String str) {
		int len=str.length();
		int up=0;
		int low=0;
		int spe=0;
		int dig=0;
		for (int i = 0; i <len; i++) {
			char ch=str.charAt(i);
			if (Character.isUpperCase(ch)) {
				up++;
			}
			else if (Character.isLowerCase(ch)) {
				low++;
			}
			else if (Character.isDigit(ch)) {
				dig++;
			}
			else
				spe++;
		}
		double upPer=(up*100.0)/len;
		double lowPer=(low*100.0)/len;
		double spePer=(spe*100.0)/len;
		double digPer=(dig*100.0)/len;
		DecimalFormat formater=new DecimalFormat("##.##");
		System.out.println("Upper Case count is: "+up+" and Percentage is: "+formater.format(upPer));
		System.out.println("Lower Case Count is: "+low+" and Percentage is: "+formater.format(lowPer));
		System.out.println("Special Case Count is:"+spe+" and Percentage is: "+formater.format(spePer));
		System.out.println("digits count is: "+dig+" and Percentage is: "+formater.format(digPer));
		System.out.println("---------------------------");
	}       
	public static void main(String[] args) {
		StringPer("ShashiKumar@123");
		StringPer(" S h a shiKumar @123");
	}

}
