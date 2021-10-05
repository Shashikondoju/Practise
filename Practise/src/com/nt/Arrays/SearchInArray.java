package com.nt.Arrays;

public class SearchInArray {
	boolean isFind(int[]a, int s) {
		for (int i = 0; i < a.length; i++) {
			if (a[i]==s) 
				return true;
		}
		return false;
	}
	int isIndex(int[]a, int s) {
		for (int i = 0; i < a.length; i++) {
			if (a[i]==s) 
				return i;
		}
		return -1;
	}
	 void isRemove(int[] ar, int ele) {
		 int index=isIndex(ar, ele);
			for (int i =index; i < ar.length-1; i++) {
				ar[i]=ar[i+1];
			}
			System.out.println(java.util.Arrays.toString(ar));
	}
	 void isInsert(int pos, int value) {
		 int []a= {1,3,11,2,4};
		 for (int i=a.length-1; i>pos; i--) {
			a[i]=a[i-1];
		}
		 a[pos]=value;
		 System.out.println(java.util.Arrays.toString(a));
	 }
	 
	public static void main(String[] args) {
		SearchInArray s=new SearchInArray();
		int [] a= {1,3,11,22};
		System.out.println(s.isFind(a, 3));
		System.out.println(s.isFind(a, 2));
		System.out.println(s.isIndex(a, 2));
		System.out.println(s.isIndex(a, 1));
		s.isRemove(a,11);
		s.isInsert(2, 51);
	}

}
