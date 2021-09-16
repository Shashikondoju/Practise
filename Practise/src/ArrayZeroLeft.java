import java.util.Arrays;

public class ArrayZeroLeft {
	
	public static int[] LeftSide(int[] a) {
		
		int [] newAr=new int[a.length];
		int count=0;
		for (int i : a) {
			if (i!=0) {				
				newAr[count]=i;
				count++;
			}
		}
		return newAr;
		
	}
	public static void main(String[] args) {
		int []a= {1,0,2,0,3,0};
		System.out.println(Arrays.toString(LeftSide(a)));
	}

}
