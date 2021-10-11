package com.nt.Test3;

public class Test8 {
	static int getMissingNo(int a[], int n)
    {
        int total =1;
        for (int i =2;i<=(n + 1); i++)
        {
            total= total+i;
            total=total- a[i - 2];
        }
        return total;
    }

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,7};
		System.out.println(getMissingNo(a, 6));
	}

}
